package tests

import org.example.pages.AndroidPage
import org.example.setup.DriverManager
import org.testng.annotations.Test

class AndroidTitleTest : TestBase(DriverManager.Platform.ANDROID) {

    @Test
    fun changeTitleTest() {
        val androidPage = AndroidPage()

        androidPage.clickMenuButton("App")
        androidPage.clickMenuButton("Activity")
        androidPage.clickMenuButton("Custom Title")

        androidPage.inputKeywordToLeftInputBox("하하")
        androidPage.clickChangeLeftButton()
        androidPage.checkLeftTitle("하하")

        androidPage.inputKeywordToRightInputBox("호호")
        androidPage.clickChangeRightButton()
        androidPage.checkRightTitle("호호")
    }
}