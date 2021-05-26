package myjava.myproject;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class my_tut_06_pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i=1; i<=16; i++){
//            for (int j=16; j>=i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.print("Enter Number for table: ");
        int n = sc.nextInt();
        int i = 1;
//        while (i<=10){
//            System.out.println(n + "X" + i +"="+ n*i );
//            i++;
//        }
//        do{
//            System.out.println(n + "X" + i +"="+ n*i );
//            i++;
//        }while (i<=10);
        int sum = 0;

        do{
            int table = n*i;
            i++;
//            System.out.println(table);
            System.out.println(sum += table );
        }while (i<=2);

    }
}
