import calculator.Calculator
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class CalculatorTest {
    @Test
    fun `adding 2 and 3 should return 5`() {
        val calc = Calculator()
        val result = calc.add(2, 3)

        expectThat(result).isEqualTo(5)
    }

    @Test
    fun `subtracting 3 from 10 should return 7`() {
        val calc = Calculator()
        val result = calc.subtract(10, 3)

        expectThat(result).isEqualTo(7)
    }

    @Test
    fun `multiplying 3 by 4 should return 12`() {
        val calc = Calculator()
        val result = calc.multiply(3, 4)

        expectThat(result).isEqualTo(12)
    }

    @Test
    fun `dividing 12 by 3 should return 4`() {
        val calc = Calculator()
        val result = calc.divide(12, 3)

        expectThat(result).isEqualTo(4.0)
    }

    @Test
    fun `dividing 12 by 5 should return 2dot4`() {
        val calc = Calculator()
        val result = calc.divide(12, 5)

        expectThat(result).isEqualTo(2.4)
    }
}