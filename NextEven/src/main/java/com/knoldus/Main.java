package com.knoldus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number = ");
        long number = sc.nextLong();

        NextEvenNumber object = new NextEvenNumber();
        long result= object.calculate(number);

        System.out.println("Next Even = "+result);

    }
}