package Lab.JAVAAssignment;
//Q7//Write a Java Program to convert the “59” to Primitive float (without
//using Constructor of Float)

public class Lab_Assignment_Q7_Activity_i {
    public static void main(String[] args) {
        String decimal = "59";
        // first we can use parseFloat() method to convert String to Float
        float f = Float.parseFloat(decimal);
        System.out.println("float equivalent of String " + decimal + " is : " + f);


    }
}
