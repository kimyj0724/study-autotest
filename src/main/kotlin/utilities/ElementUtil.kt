package org.example.utilities

import io.appium.java_client.AppiumBy
import org.example.setup.DriverManager
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

open class ElementUtil {
    private val wait = WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))

    fun findElementByXpath(xpath: String): WebElement {
        return wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(xpath)))
    }

    fun sendKeysToInput(element: WebElement, keyword: String) {
        element.clear()
        element.sendKeys(keyword)
    }

    fun swipeDown() {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val swipe = Sequence(finger, 1)

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 500, 1000))
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 500, 500))
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

        DriverManager.getDriver().perform(listOf(swipe))
    }

    fun swipeUp() {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val swipe = Sequence(finger, 1)

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 500, 500))
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 500, 1000))
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

        DriverManager.getDriver().perform(listOf(swipe))
    }
}