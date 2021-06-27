package ch.bbw.td;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void testpreperation(){
        testee = new Calculator();
    }

    @Test
    public void testAdditionTwoPossitiveIsOk(){
        assertTrue(testee.summe(10,25) == 35);
    }

    @Test
    public void testSubtractionTwoPositiveIsOk(){
        assertTrue(testee.subtraction(25,10) == 15);
    }

    @Test
    public void testAdditionOneNegativeOnePositiveIsOk(){
        assertTrue(testee.summe(-200,100)== -100);
    }

    @Test
    public void testAdditionTwoNegativeIsOk(){
        assertTrue(testee.summe(-100,-250)== -350);
        assertTrue(testee.summe(-12,-6)==-18);
    }

    @Test
    public void testSubtractionOnePositiveOneNegativeIsOk(){
        assertTrue(testee.subtraction(10,-5) == 15);
        assertTrue(testee.subtraction(5, -3) == 8);
    }

    @Test
    public void testSubtractionTwoNegativeIsOk(){
        assertTrue(testee.subtraction(-10,-10)==0);
        assertTrue(testee.subtraction(-5,-15)==10);
    }

}
