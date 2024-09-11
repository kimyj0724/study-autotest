package study01

import org.example.study01.Homework2
import org.testng.annotations.Test
import kotlin.test.assertEquals

class TestHomeWork2 {
    val HW2 = Homework2()

    @Test
    fun testMinMaxEqualMinMaxInput() {
        assertEquals("0 0", HW2.solution("0 0 0 0 0"))
    }

    @Test
    fun testMinMaxMixedOrderInput() {
        assertEquals("-33 100", HW2.solution("2 100 -10 68 -33"))
    }

    @Test
    fun testMinMaxEmptyInput() {
        assertEquals("올바르지 않은 Input 입니다.", HW2.solution(""))
    }
}