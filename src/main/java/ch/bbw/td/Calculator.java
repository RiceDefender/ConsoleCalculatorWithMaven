package ch.bbw.td;

public class Calculator {
    public int summe(int summand1, int summand2){
        if ((summand1+summand2>Integer.MIN_VALUE) ||(summand1+summand2<Integer.MAX_VALUE)) {
            return summand1 + summand2;
        } else {
            System.out.println("The given Number surpases the capability of int");
            return 0;
        }
    }

    public int subtraction(int value1, int value2){
        if ((value1-value2>Integer.MIN_VALUE) ||(value1-value2<Integer.MAX_VALUE)) {
            return value1 - value2;
        }
        else {
            System.out.println("The given Number surpases the capability of int");
            return 0;
        }
    }

    public double division(double value1, double value2){
        return  value1/value2;
    }

    public int divisionInt(int val1,int val2){
        return val1/val2;
    }

    protected double multiplication(double value1, double value2){ return value1*value2;}

    //private can not be used for tests because its private use public

}
