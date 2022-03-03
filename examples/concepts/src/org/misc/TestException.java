package org.misc;

public class TestException {

    public static void dividing(int a ,int b)throws ArithmeticException{
        int result = 0;
        System.out.println("before division");

        try {
            result = a / b;
            System.out.println("result of division " + result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally { //always executes with or without exception //used for resource de-allocation
            System.out.println("from exception.");
        }
        System.out.println("after division");
    }

    public static void main(String[] args){
        TestException.dividing(20,10);

    }
}
