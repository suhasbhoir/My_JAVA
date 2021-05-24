import java.util.Locale;

public class test2_num_format {
    public static void main(String[] args) {
        String msg="This is basic JAVA Number data type Program";
        byte b=127;
        short s=30001;
        int i=52412;
        long l=5241;
        float f=50.32f;
        double d=458752;
        boolean bl=true;
        char c='a';
    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(bl);
    System.out.println(c);
    System.out.println(msg);
    System.out.println("The Length of message is: " + msg.length());
    System.out.println("To Upper----> " + msg.toUpperCase());
    System.out.println("To Lower-------> " + msg.toLowerCase());
    System.out.println("Index of 'JAVA' in the string is-------> " + msg.indexOf("JAVA"));

    }
}
