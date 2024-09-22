package org.example

import io.appium.java_client.AppiumBy
import org.example.setup.DriverManager
import org.testng.annotations.Test
import org.openqa.selenium.support.ui.ExpectedConditions
import kotlin.test.assertEquals

class IOSComputeSumTest : TestBase(DriverManager.Platform.iOS) {

    @Test
    fun computeSumTest() {
        val integerA = "1"
        val integerB = "2"

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerA']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerA']"))).sendKeys(integerA)

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerB']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerB']"))).sendKeys(integerB)
        tapElementByXpath(wait, "//XCUIElementTypeButton[@name='ComputeSumButton']")

        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Answer']"))).getAttribute("label"), "3")
    }
}