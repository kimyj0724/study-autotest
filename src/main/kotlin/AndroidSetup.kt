package org.example

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.options.BaseOptions
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test
import java.net.URL

class AndroidSetup {
    lateinit var driver : AndroidDriver

    @BeforeClass
    fun setUp() {
        var options = BaseOptions()
            .amend("appium:platformVersion", "14.0")
            .amend("appium:deviceName", "Pixel 4 API 31")
            .amend("appium:automationName", "UiAutomator2")
            .amend("appium:udid", "emulator-5554")
            .amend("appium:app", "/Users/kimyj/Downloads/ApiDemos-debug.apk")
            .amend("appium:noReset", true)
            .amend("appium:ensureWebviewsHavePages", true)
            .amend("appium:nativeWebScreenshot", true)
            .amend("appium:newCommandTimeout", 3600)
            .amend("appium:connectHardwareKeyboard", true)

        fun getUrl() : URL {
            return URL("http://127.0.0.1:4723")
        }

        driver = AndroidDriver(getUrl(), options)
    }

    @Test
    fun sampleTest() {
        println("TEST")

    }

    @AfterClass
    fun tearDown() {
        driver.quit()
    }
}
