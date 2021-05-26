package myjava.myproject;

import java.util.Scanner;

public class my_Prac_03 {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you Full name: ");
        String name = sc.nextLine();
        System.out.println("Enter marks of subject of 'Maths' here: ");
        float math = sc.nextFloat();
        System.out.println("Enter marks of subject of 'Physic' here: ");
        float phys = sc.nextFloat();
        System.out.println("Enter marks of subject of 'Science' here: ");
        float sci = sc.nextFloat();
        System.out.println("Enter marks of subject of 'Biology' here: ");
        float bio = sc.nextFloat();
        System.out.println("Enter marks of subject of 'English' here: ");
        float eng = sc.nextFloat();
        System.out.println("Enter marks of subject of 'Marathi' here: ");
        float mar = sc.nextFloat();
        float total = math + phys + sci + bio+ eng + mar;
        System.out.println("Your Total marks of all subject is:- " + total);
        float per = (total / 600.0f) * 100;
        System.out.println("Dear " + name + " Your percentage is: " + per);
    }
}
