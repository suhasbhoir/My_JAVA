package Lab.JAVAAssignment;
import java.util.Scanner;
//Q1//v.Write a Java Program to determine whether the number is prime or not.


public class Lab_Assignment_Q1_Activity_v {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to determine whether the number is Prime or not: ");
        int number = sc.nextInt();
        int i =2;
        boolean flag = false;

        while (i <= number / 2) {
            // condition for non prime number
            if (number % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }
        if (!flag){System.out.println(number+" is a prime number");}
        else {System.out.println(number+" is not a prime number");}
    }
}
