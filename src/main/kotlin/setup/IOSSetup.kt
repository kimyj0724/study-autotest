package org.example.setup

import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.options.BaseOptions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import java.net.URL
import java.time.Duration

open class iOSSetup {
    lateinit var driver : IOSDriver
    lateinit var wait : WebDriverWait

    @BeforeClass
    fun setUp() {
        var options = BaseOptions()
            .amend("platformName", "iOS")
            .amend("appium:platformVersion", "17.5")
            .amend("appium:deviceName", "iPhone 15 Pro")
            .amend("appium:automationName", "XCuiTest")
            .amend("appium:udid", "712529F5-D307-4261-8809-6D95457F1FC0")
            .amend("appium:app", "/Users/kimyj/Downloads/TestApp.app")
            //.amend("appium:noReset", true)
            .amend("appium:includeSafariInWebviews", true)
            .amend("appium:newCommandTimeout", 3600)
            .amend("appium:connectHardwareKeyboard", true);

        fun getUrl() : URL {
            return URL("http://127.0.0.1:4723")
        }

        driver = IOSDriver(getUrl(), options)
        wait = WebDriverWait(driver, Duration.ofSeconds(10))
    }

    @AfterClass
    fun tearDown() {
        driver.quit()
    }
}
