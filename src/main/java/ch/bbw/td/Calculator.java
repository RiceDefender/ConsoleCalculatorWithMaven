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
}
