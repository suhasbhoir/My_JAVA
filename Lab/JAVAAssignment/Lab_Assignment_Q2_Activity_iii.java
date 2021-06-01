package Lab.JAVAAssignment;
//Q2//iii.Write a Java Program to print following
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// 3

public class Lab_Assignment_Q2_Activity_iii {
    public static void main(String[] args) {
        int n=5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
                }
        System.out.println(" ");
            }
    }
}
