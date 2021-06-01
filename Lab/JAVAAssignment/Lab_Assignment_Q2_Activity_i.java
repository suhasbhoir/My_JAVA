package Lab.JAVAAssignment;
//Q2//i.Write a Java program for the following scenario: Run a loop from 1 to 100, while looping when the number
// is even print its square and when the number is odd print its cube.

public class Lab_Assignment_Q2_Activity_i {
    public static void main(String[] args) {
        int n=100;
        for (int i=1; i<=n; i++){
            if (i % 2 == 0){
                System.out.format("\n%d is a even number and Square of %d is: %d",i, i, i*i);
            }
            else {
                System.out.format("\n%d is an odd number and Cube of %d is: %d", i, i, i * i * i);
            }
        }
    }
}
