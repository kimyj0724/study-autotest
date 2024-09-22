package org.example.utilities

import io.appium.java_client.AppiumBy
import org.example.setup.DriverManager
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

open class ElementUtil {
    private val wait : WebDriverWait = WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))

    fun findElementByXpath(xpath: String): WebElement {
        return wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(xpath)))
    }

    fun sendKeysToInput(element: WebElement, keyword: String) {
        element.clear()
        element.sendKeys(keyword)
    }

    fun tapElement(element: WebElement) {
        element.click()
    }
}