import calculator.Calculator
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `adding 2 and 3 should return 5`() {
        expectThat(calculator.add(2, 3)).isEqualTo(5)
    }

    @Test
    fun `subtracting 10 and 3 should return 7`() {
        expectThat(calculator.subtract(10, 3)).isEqualTo(7)
    }

    @Test
    fun `multiplying 3 and 4 should return 12`() {
        expectThat(calculator.multiply(3, 4)).isEqualTo(12)
    }

    @Test
    fun `dividing 12 by 3 should return 4dot0`() {
        expectThat(calculator.divide(12, 3)).isEqualTo(4.0)
    }

    @Test
    fun `dividing 12 by 5 should return 2dot4`() {
        expectThat(calculator.divide(12, 5)).isEqualTo(2.4)
    }
}