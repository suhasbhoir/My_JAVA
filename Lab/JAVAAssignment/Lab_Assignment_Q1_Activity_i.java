package Lab.JAVAAssignment;
import java.util.Scanner;
//Q1//i. Write a Java class to swap two numbers without using third variable.

class swap_Two_Number{
    int x;
    int y;
}

public class Lab_Assignment_Q1_Activity_i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();

        System.out.print("Please enter the number for x: ");
        x = sc.nextInt();
        System.out.print("Please enter the number Y: ");
        y = sc.nextInt();
        System.out.printf("\nNumber before swap x = %d and y = %d", x, y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.printf("\nNumber after swap x = %d and y = %d", x, y);


        



    }
}
