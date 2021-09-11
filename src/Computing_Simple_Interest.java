/*
 *  UCF COP3330 Fall 2021 Assignment 1.12 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class Computing_Simple_Interest {
    public static void main(String[] arg){
        System.out.print("Enter the principal: ");
        Scanner principalInp = new Scanner(System.in);
        int principal = principalInp.nextInt();

        System.out.print("Enter the percentage rate of interest: ");
        Scanner rateInp = new Scanner(System.in);
        double rate = rateInp.nextDouble();
        double percentage = rate/100;

        System.out.print("Enter the number of years: ");
        Scanner yearsInp = new Scanner(System.in);
        int years = yearsInp.nextInt();

        double total = principal + (principal * percentage * years);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", years, rate,total);

    }
}
