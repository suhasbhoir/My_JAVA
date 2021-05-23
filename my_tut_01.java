package myjava.myproject;

import java.util.Locale;
import java.util.SortedMap;

public class my_tut_01 {
    public static void main(String[] args) {

        String myCapName = "SUHAS BHASKAR BHOIR";
        myCapName = myCapName.toLowerCase();
        System.out.println(myCapName);
        myCapName = myCapName.replace(" ", "<>");
        System.out.println(myCapName);
        String letterch = "Hi <|name|> how are you doing!!!";
        letterch = letterch.replace("<|name|>", "Suhas");
        System.out.println(letterch);
        String myspacestr = "Hi you are   not   keeping well?";
        System.out.println(myspacestr.indexOf("   "));
        System.out.println(myspacestr.replace("   ", " "));




    }
}
