package myjava.myproject;
import java.util.Scanner;

public class my_tut_06_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ether the number here to print pattern: ");
        int b = sc.nextInt();
        System.out.print("Which Pattern you would like to print *, #, & or nay number: ");
        char pt = sc.next().charAt(0);
        for (int i=1; i<=b; i++){
            for (int j=1; j<=i; j++) {
                System.out.print(pt);
            }
            System.out.println();
        }

     }
}
