
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorMultiTest {

    @Test
    public void multiTest(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(8,2);
        Assertions.assertEquals(16,result);

    }

    public void multiZeroTest(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(0,2);
        Assertions.assertEquals(0,result);

    }
}