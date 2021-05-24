import java.util.*;

public class MYCALC {
    public static void main(String[] args) {
        System.out.println("My calc");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();
        int c = a+b;
        System.out.println("Addition is " + c);
        int d = a-b;
        System.out.println("Subtraction is " + d);
        int e = a/b;
        System.out.println("Division is " + e);
        int f = a*b;
        System.out.println("Multiplication is " + f);

    }
}
