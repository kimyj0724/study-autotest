package org.example.utilities

import io.appium.java_client.AppiumBy
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

interface ElementUtil {

    fun tapElementByXpath(wait: WebDriverWait, xpath: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(xpath))).click()
    }

}