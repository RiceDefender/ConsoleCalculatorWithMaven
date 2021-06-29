package ch.bbw.td;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testMaxAdditionOnePositiveAddition(){
      assertTrue(testee.summe(Integer.MAX_VALUE, 5)==Integer.MIN_VALUE+4);
    }

    @Test
    public void testtwoMaxAddition(){
        assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE)== -2);
    }

    @Test
    public void testAdditionOneMinOneMaxIsOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE)==-1);
    }

    @Test
    public void testAdditionTwoMinIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, Integer.MIN_VALUE)==0);
    }

    @Test
    public void testAdditionOneNegativeOneMinIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, -5)==Integer.MAX_VALUE-4);
    }

    @Test
    public void testSubtractionOneMinOnePositiveIsOk(){
        assertTrue(testee.subtraction(Integer.MIN_VALUE, 5)==Integer.MAX_VALUE-4);
    }

    @Test
    public void testSubtractionTwoMinIsOk(){
        assertTrue(testee.subtraction(Integer.MIN_VALUE, Integer.MIN_VALUE)==0);
    }
}
