package org.example.pages

import org.example.utilities.ElementUtil
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo

class AndroidPage : ElementUtil() {

    fun clickMenuButton(menuName: String) {
        findElementByXpath("//android.widget.TextView[@content-desc='$menuName']").click()
    }

    fun inputKeywordToLeftInputBox(keyword: String) {
        val leftInputBox = findElementByXpath("//android.widget.EditText[@content-desc='Left is best']")
        sendKeysToInput(leftInputBox, keyword)
    }

    fun clickChangeLeftButton() {
        findElementByXpath("//android.widget.Button[@content-desc='Change Left']").click()
    }

    fun checkLeftTitle(result: String) {
        assertThat("Left Title이 다릅니다.", findElementByXpath("//android.widget.TextView[@content-desc='Left is best']").text, equalTo(result))
    }

    fun inputKeywordToRightInputBox(keyword: String) {
        val rightInputBox = findElementByXpath("//android.widget.EditText[@content-desc='Right is always right']")
        sendKeysToInput(rightInputBox, keyword)
    }

    fun clickChangeRightButton() {
        findElementByXpath("//android.widget.Button[@content-desc='Change Right']").click()
    }

    fun checkRightTitle(result: String) {
        assertThat("Right Title이 다릅니다.", findElementByXpath("//android.widget.TextView[@content-desc='Right is always right']").text, equalTo(result))
    }
}