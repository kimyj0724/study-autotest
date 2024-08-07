import org.example.Homework1
import org.testng.annotations.Test
import org.testng.Assert.assertEquals

class TestHomeWork1 {
    val HW1: Homework1 = Homework1()

    @Test
    fun testMultiplicationTable() {
        assertEquals(listOf(3, 6, 9, 12, 15, 18, 21, 24, 27), HW1.multiplicationTable(3))
    }
}