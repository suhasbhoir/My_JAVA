package Lab.JAVAAssignment;
import java.util.*;

//Q15//Sort the given list of objects in order of their email Contact:
//id, name, email, phone

public class Lab_Assignment_Q15_Activity_i {
    public static void main(String[] args) {

        List<String> Contact = new ArrayList<>();
        Contact.add("id");
        Contact.add("name");
        Contact.add("email");
        Contact.add("phone");

            Collections.sort(Contact);

            for(String str: Contact){
                System.out.println(str);
            }
        }
}
