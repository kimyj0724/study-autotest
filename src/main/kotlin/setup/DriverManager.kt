package org.example.setup

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.options.BaseOptions
import java.net.URL

object DriverManager {
    private lateinit var driver: AppiumDriver

    enum class Platform {
        ANDROID, iOS
    }

    fun getDriver(): AppiumDriver {
        return driver
    }

    fun setDriver(platform: Platform) {
        when (platform) {
            Platform.ANDROID -> setAndroidDriver()
            Platform.iOS -> setiOSDriver()
        }
    }

    private fun setAndroidDriver() {
        val options = BaseOptions()
            .amend("appium:platformVersion", "14.0")
            .amend("appium:deviceName", "Pixel 4 API 31")
            .amend("appium:automationName", "UiAutomator2")
            .amend("appium:udid", "emulator-5554")
            .amend("appium:app", "/Users/kimyj/Downloads/ApiDemos-debug.apk")
            //.amend("appium:noReset", true)
            .amend("appium:ensureWebviewsHavePages", true)
            .amend("appium:nativeWebScreenshot", true)
            .amend("appium:newCommandTimeout", 3600)
            .amend("appium:connectHardwareKeyboard", true)

        driver = AndroidDriver(getUrl(), options)
    }

    private fun setiOSDriver() {
        val options = BaseOptions()
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

        driver = IOSDriver(getUrl(), options)
    }

    private fun getUrl() : URL {
        return URL("http://127.0.0.1:4723")
    }

    fun tearDown() {
        driver.quit()
    }
}