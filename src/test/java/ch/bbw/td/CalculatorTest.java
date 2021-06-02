package ch.bbw.td;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculatorTest {
    Calculator testee;

    @Test
    public void testAdditionTwoPossitiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(10,25) == 35);
    }

    @Test
    public void testSubtractionTwoPositiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.subtraction(25,10) == 15);
    }


}
