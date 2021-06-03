package Lab.JAVAAssignment;
//Q13//ii. Write a Java program for separate hours, minutes and
//seconds from following string 01:23:45 PM.

public class Lab_Assignment_Q13_Activity_ii {
    public static void main(String[] args) {
        String str = "01:23:45 PM";
        str= str.replace(str.substring(str.length()-2), "");
        String[] element = str.split(":");

        for (String e : element){
            System.out.println(e);
        }
    }
}
