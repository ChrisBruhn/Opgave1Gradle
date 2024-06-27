
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorMultiTest {

    @Test
    public void multiTest(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2,2);
        Assertions.assertEquals(4,result);

    }
}