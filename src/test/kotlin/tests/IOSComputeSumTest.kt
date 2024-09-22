package tests

import org.example.pages.IOSPage
import org.example.setup.DriverManager
import org.testng.annotations.Test

class IOSComputeSumTest : TestBase(DriverManager.Platform.iOS) {

    @Test
    fun computeSumTest() {
        val iOSPage = IOSPage()
        val integerA = "1"
        val integerB = "2"

        iOSPage.inputKeywordToInputBoxA(integerA)
        iOSPage.inputKeywordToInputBoxB(integerB)
        iOSPage.clickComputeSumButton()
        iOSPage.checkComputeResult("3")
    }
}