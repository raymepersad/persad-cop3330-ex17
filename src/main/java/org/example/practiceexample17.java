/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 17 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink.
Calculate your blood alcohol content (BAC) using this formula
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
 */

package org.example;
import java.util.Scanner;

public class practiceexample17 {
    public static void main(String[] args) {

        int A, W, H, g; //declare variables
        float r;
        double BAC;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: "); //input for male or female
        g = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have ? "); //input for amount of alcohol in ounces
        A = sc.nextInt();

        System.out.print("What is your weight, in pounds ? "); //input for weight
        W = sc.nextInt();

        System.out.print("How many hours has it been since yours last drink? "); //input for time between drinks
        H = sc.nextInt();

        sc.close();

        if (g == 1) {
            r = (float) 0.73; //loop to see if male then BAC
        }
        else{
            r = (float) 0.66; //loop for female then BAC
        }

        BAC = (A * 5.14 / W * r) - (0.015 * H); //BAC formula

        System.out.println("Your BAC is " + BAC);
        if (BAC < 0.08) { //compare to BAC of 0.08 legal limit
            System.out.println("It is legal for you to drive."); //print results 1
        }
        else{
            System.out.println("It is illegal for you to drive."); //print results 2
    }
}

