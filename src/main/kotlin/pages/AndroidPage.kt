package org.example.pages

import org.example.utilities.ElementUtil
import io.appium.java_client.AppiumBy
import org.openqa.selenium.support.ui.ExpectedConditions
import kotlin.test.assertEquals

class AndroidPage : ElementUtil() {
    init {
        setWebDriverWait()
    }

    fun clickMenuButton(menuName: String) {
        tapElementByXpath("//android.widget.TextView[@content-desc='$menuName']")
    }

    fun inputKeywordToLeftInputBox(keyword: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Left is best']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Left is best']"))).sendKeys(keyword)
    }

    fun clickChangeLeftButton() {
        tapElementByXpath("//android.widget.Button[@content-desc='Change Left']")
    }

    fun checkLeftTitle(result: String) {
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@content-desc='Left is best']"))).text, result)
    }

    fun inputKeywordToRightInputBox(keyword: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Right is always right']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Right is always right']"))).sendKeys(keyword)
    }

    fun clickChangeRightButton() {
        tapElementByXpath("//android.widget.Button[@content-desc='Change Right']")
    }

    fun checkRightTitle(result: String) {
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@content-desc='Right is always right']"))).text, result)
    }
}