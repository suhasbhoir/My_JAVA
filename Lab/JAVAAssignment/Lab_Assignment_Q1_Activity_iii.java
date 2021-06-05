package Lab.JAVAAssignment;
//Q1//iii.Write a Java class to print the Fibonacci sequence
// till 100

public class Lab_Assignment_Q1_Activity_iii {
    public static void main(String[] args) {
        int n = 100;
        int firstNum = 0;
        int secondNum = 1;
        System.out.println("This program print Fibonacci sequence till "+n+" term");
        for (int i = 1; i<=n; i++){
            System.out.print("\n"+firstNum);
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

    }
}
