package org.example.pages

import org.example.utilities.ElementUtil
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo

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
        assertThat("계산 결과가 다릅니다.", findElementByXpath("//XCUIElementTypeStaticText[@name='Answer']").getAttribute("label"), equalTo(result))
    }
}