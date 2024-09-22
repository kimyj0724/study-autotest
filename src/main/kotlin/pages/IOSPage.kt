package org.example.pages

import org.example.utilities.ElementUtil
import kotlin.test.assertEquals

class IOSPage : ElementUtil() {

    fun inputKeywordToInputBoxA(keyword: String) {
        val inputBoxA = findElementByXpath("//XCUIElementTypeTextField[@name='IntegerA']")
        sendKeysToInput(inputBoxA, keyword)
    }

    fun inputKeywordToInputBoxB(keyword: String) {
        val inputBoxB = findElementByXpath("//XCUIElementTypeTextField[@name='IntegerB']")
        sendKeysToInput(inputBoxB, keyword)
    }

    fun clickComputeSumButton() {
        findElementByXpath("//XCUIElementTypeButton[@name='ComputeSumButton']").click()
    }

    fun checkComputeResult(result: String) {
        assertEquals(findElementByXpath("//XCUIElementTypeStaticText[@name='Answer']").getAttribute("label"), result)
    }
}