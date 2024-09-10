package org.example

import io.appium.java_client.AppiumBy
import org.testng.annotations.Test
import org.openqa.selenium.support.ui.ExpectedConditions
import kotlin.test.assertEquals

class AndroidTitleTest : AndroidSetup() {
    @Test
    fun changeTitleTest() {
        tapElementByXpath("//android.widget.TextView[@content-desc='App']")
        tapElementByXpath("//android.widget.TextView[@content-desc='Activity']")
        tapElementByXpath("//android.widget.TextView[@content-desc='Custom Title']")

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Left is best']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Left is best']"))).sendKeys("하하")
        tapElementByXpath("//android.widget.Button[@content-desc='Change Left']")
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@content-desc='Left is best']"))).text, "하하")

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Right is always right']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Right is always right']"))).sendKeys("호호")
        tapElementByXpath("//android.widget.Button[@content-desc='Change Right']")
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@content-desc='Right is always right']"))).text, "호호")
    }

    private fun tapElementByXpath(xpath: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(xpath))).click()
    }
}