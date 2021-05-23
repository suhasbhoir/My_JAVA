package myjava.myproject;

public class my_tut_08_method {
    static int add (int a, int b){
        return a + b;
    }
    static int sub (int a, int b){
        return a - b;
    }
    static int div (int a, int b){
        return a / b;
    }
    static int div (int x, int y, int z){
        return (x + y) /z;
    }
    static void suu(){
        System.out.println("Good Morning Coders");
    }
    static void suu(int y){
        System.out.println("Good afternoon Coders " + 200);
    }
    static void suu(int x, int y){
        System.out.println("you all are Gr8 " + x +" "+ y);
    }
    static int maxsum (int x, int ...arr){
        int result = x;
        for (int e : arr){
            result += e;
        }
        return result;

    }

    public static void main(String[] args) {

        int c = add(7, 3);
        System.out.println(c);

        int d = sub(10, 4);
        System.out.println(d);

        int e = div(13, 2);
        System.out.println(e);

        int f = div(13, 2, 7);
        System.out.println(f);

        suu();
        suu(200);
        suu(312, 4201);

        System.out.println("Maximum number sum is: " + maxsum(1, 4, 6, 3, 8, 71, 76, 54));
        System.out.println("Maximum number sum is: " + maxsum(10));
    }
}
