package Lab.JAVAAssignment;
import java.util.*;

//Q14//iii. Write a Java Program to find the number of String starting
//with „S‟ from following TreeSet [ Smith, Alex , Tom, Steve,
//Mark, Sammy]

public class Lab_Assignment_Q14_Activity_iii {
    public static void main(String[] args) {
        TreeSet<String> te=new TreeSet<>();
        te.add("Smith");
        te.add("Alex");
        te.add("Tom");
        te.add("Steve");
        te.add("Mark");
        te.add("Sammy");
        System.out.println(te);
        List<String> searchResult = new ArrayList<>();
        for (String string : te) {
            if(string.startsWith("S"))
                searchResult.add(string);
        }
        System.out.println("Displaying result containing String starts with letter 'S'");
        // Displays result containing those letters
        List<String> stringCount = new ArrayList<>();
        for (String string1 : searchResult) {
            System.out.println(string1);
            stringCount.add(string1);
        }
        System.out.println("Total number of String starting with 'S' is: "+ stringCount.size());
    }
}
