package Lab.JAVAAssignment;
//Q12//i. Write a Java Program to make an Exception AgeException.
//When user passes some age and if age is less than 18 throw
//this Exception.

import java.util.Scanner;

class AgeException extends Exception{
    public AgeException(String str) {
        System.out.println(str);
    }
}
public class Lab_Assignment_Q12_Activity_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeException("Invalid Age for this program !!!");
            }
            else {
                System.out.println("Valid age for this program...");
            }

        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}