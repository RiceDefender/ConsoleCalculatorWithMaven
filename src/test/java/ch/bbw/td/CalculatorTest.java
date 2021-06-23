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

    @Test
    public void testAdditionOneNegativeOnePositiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(-200,100)== -100);
    }

    @Test
    public void testAdditionTwoNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(-100,-250)== -350);
        assertTrue(testee.summe(-12,-6)==-18);
    }

    @Test
    public void testSubtractionOnePositiveOneNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.subtraction(10,-5) == 15);
        assertTrue(testee.subtraction(5, -3) == 8);
    }

    @Test
    public void testSubtractionTwoNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.subtraction(-10,-10)==0);
        assertTrue(testee.subtraction(-5,-15)==10);
    }

}
