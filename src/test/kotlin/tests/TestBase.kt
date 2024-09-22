package tests

import org.example.setup.DriverManager
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass

open class TestBase(val platform: DriverManager.Platform) {
    @BeforeClass
    fun setUp() {
        DriverManager.setDriver(platform)
    }

    @AfterClass
    fun tearDown() {
        DriverManager.getDriver()
    }
}