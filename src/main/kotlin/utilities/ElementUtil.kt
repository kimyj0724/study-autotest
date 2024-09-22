package org.example.utilities

import io.appium.java_client.AppiumBy
import org.example.setup.DriverManager
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

open class ElementUtil {
    lateinit var wait : WebDriverWait

    fun setWebDriverWait() {
        wait = WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
    }

    fun tapElementByXpath(xpath: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(xpath))).click()
    }
}