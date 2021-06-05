package Lab.JAVAAssignment;
//Q14//i. Write a Java Program to store the following data, in the
//collection you feel will suite best.
//Name- Tom
//Email- tom@gmail.com
//Phone:9988776655

public class Lab_Assignment_Q14_Activity_i {
    public static void main(String[] args) {
        String[] employeeData = {"Name- Tom", "email- tom@gmail.com", "mobile- 9988776655"};
//        for (int i=0; i<employeeData.length; i++){
//            System.out.println(employeeData[i]);
//        }
        for (String element: employeeData){
            System.out.println(element);

        }

    }
}
