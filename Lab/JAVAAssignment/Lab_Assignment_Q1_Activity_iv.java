package Lab.JAVAAssignment;
import java.util.Scanner;
//Q1//iv.Write a Java Program to determine whether the number is Armstrong or not.

public class Lab_Assignment_Q1_Activity_iv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to determine whether the number is Armstrong or not: ");
        int number = sc.nextInt();
        int originalNumber, reminder, result=0;
        originalNumber = number;
        do{
            reminder = originalNumber % 10;
            result += Math.pow(reminder, 3);
            originalNumber /= 10;
        }while (originalNumber !=0);
        if (result == number){
            System.out.println(number+" is Armstrong number");
        }
        else {
            System.out.println(number+" is not Armstrong number");

        }
    }
}
