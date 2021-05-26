package myjava.myproject;

public class my_tut_05_loops {
    public static void main(String[] args) {
        System.out.println("Running While Loop");
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("Now running Do While Loop");
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while (a <= 5);

        System.out.println("Running For Loop");

        for (int b=1; b<=5; b++){
            System.out.println(b);
        }

        for (int b=5; b>0; b++){
            System.out.println(b);
        }
    }
}
