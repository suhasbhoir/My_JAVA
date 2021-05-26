package myjava.myproject;
import java.util.Scanner;

public class my_tut_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter you age here: ");
        int age = sc.nextInt();
        if (age == 18 || age > 18){ // or you can write simply (age >= 18)
            System.out.println("you can drive");
        }
        else {
            System.out.println("you can not drive. Keep your glance in your study's");
        }



    }
}
