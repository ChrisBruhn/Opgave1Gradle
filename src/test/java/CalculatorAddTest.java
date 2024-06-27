import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorAddTest {


        @Test
        public void addTest(){
            Calculator calculator = new Calculator();
            int result = calculator.add(2,2);
            Assertions.assertEquals(4,result);


        }

    }

