package Lab.JAVAAssignment;

//Q14//ii. Write a Java Program to find the minimum value in Vector
// [8,9,1,3,4].
//iii. Write a Java Program

public class Lab_Assignment_Q14_Activity_ii {
    public static void main(String[] args) {
        int smallNum;
        int[] vtr = new int []{8, 9, 1, 3, 4};
        smallNum = vtr[0];
        for (int element: vtr){
            if (smallNum > element){
                smallNum = element;
            }
        }
        System.out.println("Smallest Number in vector is: "+ smallNum );

    }
}
