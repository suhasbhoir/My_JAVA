package Lab.JAVAAssignment;
import java.util.Scanner;
//Q1//ii.Write a Java Program to determine reverse the number

public class Lab_Assignment_Q1_Activity_ii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to print in revers order: ");
        int num = sc.nextInt();

        int reversed = 0;
            do{
            int oct = num % 10;

            reversed = reversed * 10 + oct;
            num /= 10;

        }while (num != 0);

        System.out.println(reversed);

        System.out.println(" Program to determine reverse the number is: "+reversed);


    }
}
