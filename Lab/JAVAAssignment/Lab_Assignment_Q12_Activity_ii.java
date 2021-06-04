package Lab.JAVAAssignment;
import java.util.Scanner;

//Q12//Create an Exception StringNotPalindromeException. Write a
//class with method which throws this Exception when String
//passed is not palindrome.

class StringNotPalindromeException extends Exception{
    public StringNotPalindromeException(String str){
        System.out.println(str);
    }
}
public class Lab_Assignment_Q12_Activity_ii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a String here: ");
        String checkStr = sc.nextLine();
        String revStr="";
        try {
            for (int i=checkStr.length()-1; i>=0; i--) {
                revStr = revStr + checkStr.charAt(i);
            }
                if (checkStr.equals(revStr)){
                    System.out.println("String is palindrome");
                }
                else {
                    throw new StringNotPalindromeException("String is not palindrome");
                }
            }
         catch (StringNotPalindromeException e) {
            System.out.println(e);
        }
    }
}
