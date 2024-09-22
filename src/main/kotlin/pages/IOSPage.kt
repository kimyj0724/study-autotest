package org.example.pages

import org.example.utilities.ElementUtil
import io.appium.java_client.AppiumBy
import org.openqa.selenium.support.ui.ExpectedConditions
import kotlin.test.assertEquals

class IOSPage : ElementUtil() {
    init {
        setWebDriverWait()
    }

    fun inputKeywordToInputBoxA(keyword: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerA']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerA']"))).sendKeys(keyword)
    }

    fun inputKeywordToInputBoxB(keyword: String) {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerB']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerB']"))).sendKeys(keyword)
    }

    fun clickComputeSumButton() {
        tapElementByXpath("//XCUIElementTypeButton[@name='ComputeSumButton']")
    }

    fun checkComputeResult(result: String) {
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Answer']"))).getAttribute("label"), result)
    }
}