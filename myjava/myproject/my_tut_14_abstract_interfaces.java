package myjava.myproject;

import java.util.Scanner;

interface CalcFunction{
    int Addition(int x, int ...arr);
    int Subtraction(int x, int y);
    int Multiplication(int x, int y);
    int Division(int x, int y);
}
class Calculations implements CalcFunction{
    @Override
    public int Addition(int x, int ...arr){
        int result = x;
        for (int element : arr){
            result += element;
        }
        return result;
    }

    @Override
    public int Subtraction(int x, int y) {
        return x - y;
    }

    @Override
    public int Multiplication(int x, int y) {
        return x * y;
    }

    @Override
    public int Division(int x, int y) {
        return x / y;
    }

}
class Calculation_For_User extends Calculations{
    public void messageForUser(){
        System.out.println("User Interface For calculations");
    }

}
public class my_tut_14_abstract_interfaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter Second number: ");
        int num2 = sc.nextInt();

        Calculation_For_User usr1 = new Calculation_For_User();
        usr1.messageForUser();
        System.out.println("Addition of two number is " +usr1.Addition(num1, num2));
        System.out.println("Subtraction of two number is " +usr1.Subtraction(num1, num2));
        System.out.println("Multiplication of two number is " +usr1.Multiplication(num1, num2));
        System.out.println("Division of two number is " +usr1.Division(num1, num2));
    }
}
