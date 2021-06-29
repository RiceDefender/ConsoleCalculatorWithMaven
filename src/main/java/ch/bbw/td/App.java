package ch.bbw.td;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator c = new Calculator();
        System.out.println("Subtraction of 5 - 10 = "+ c.subtraction(5, 10));
        System.out.println("Addition of 25 + 25 = "+ c.summe(25, 25));
        System.out.println("Division of 20 / 10 = " + c.division(20.0, 10.0));
        System.out.println("SquareRoot of 25 = "+c.squareRoot(25));
    }
}
