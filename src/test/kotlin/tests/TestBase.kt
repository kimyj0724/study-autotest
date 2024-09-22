package tests

import org.example.setup.DriverManager
import org.example.utilities.ElementUtil
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass

open class TestBase(val platform: DriverManager.Platform) : ElementUtil() {
    @BeforeClass
    fun setUp() {
        DriverManager.setDriver(platform)
        setWebDriverWait()
    }

    @AfterClass
    fun tearDown() {
        DriverManager.getDriver()
    }
}