package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        System.out.println("Enter the age of your baby: ");
        Scanner scanner = new Scanner(System.in);
        int inputAge = scanner.nextInt();
        WHCalculator myWhCalculator = new WHCalculator(inputAge);
        String result = myWhCalculator.getHealthyBaby(inputAge);

        System.out.println("your baby should have this heigh and weight: " + result);

    }


}