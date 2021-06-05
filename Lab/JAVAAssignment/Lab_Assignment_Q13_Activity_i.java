package Lab.JAVAAssignment;
import java.util.Scanner;

//Q13//i. Write a Java program to determine the number of vowels in a
//String

public class Lab_Assignment_Q13_Activity_i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vowelCount=0, consonantCount=0;
        System.out.print("Please enter the string here:  ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u'){
                vowelCount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);


    }
}
