package tests

import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import org.example.setup.AndroidSetup
import org.example.utilities.ElementUtil
import org.testng.annotations.Test
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import kotlin.test.assertEquals

class AndroidTitleTest : AndroidSetup(), ElementUtil {
    @Test
    fun changeTitleTest() {
        tapElementByXpath(wait, "//android.widget.TextView[@content-desc='App']")
        tapElementByXpath(wait, "//android.widget.TextView[@content-desc='Activity']")
        tapElementByXpath(wait, "//android.widget.TextView[@content-desc='Custom Title']")

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Left is best']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Left is best']"))).sendKeys("하하")
        tapElementByXpath(wait, "//android.widget.Button[@content-desc='Change Left']")
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@content-desc='Left is best']"))).text, "하하")

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Right is always right']"))).clear()
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@content-desc='Right is always right']"))).sendKeys("호호")
        tapElementByXpath(wait, "//android.widget.Button[@content-desc='Change Right']")
        assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@content-desc='Right is always right']"))).text, "호호")
    }
}