
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorMultiTest {
    Calculator calculator = new Calculator();


    @Test
    void testDivideByZero() {
            Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        Assertions.assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void testParseInvalidNumber() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.parseNumber("abc");
        });
        Assertions.assertEquals("Invalid number format", exception.getMessage());
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testParseNumber() {
        Assertions.assertEquals(123, calculator.parseNumber("123"));
    }

    @Test
    public void multiTest(){

        int result = calculator.multiply(8,2);
        Assertions.assertEquals(16,result);

    }
    @Test
    public void multiZeroTest(){

        int result = calculator.multiply(0,2);
        Assertions.assertEquals(0,result);

    }
}