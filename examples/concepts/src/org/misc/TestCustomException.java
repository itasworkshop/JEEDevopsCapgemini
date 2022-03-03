package org.misc;

import java.util.Scanner;

class VaccineAgeViolationException extends Exception{

    public VaccineAgeViolationException(String errorMessage){
        super(errorMessage);
    }

}
public class TestCustomException {

    public static void main(String[] args) throws VaccineAgeViolationException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <=45 ){
            System.out.println("Can be vaccinated!");
        }else {
            throw new VaccineAgeViolationException("Can not be vaccinated!");
        }

    }
}
