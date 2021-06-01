package Lab.JAVAAssignment;
//Q9//Write a Java program to write the following,
// class A  with method m1( ) and m2( ) and write a
// class B with methods m3( ) and m4( ), Override the methods of A in class B.

class A{
    void m1(){
        System.out.println("m1 method of class A");
    }
    void m2(){
        System.out.println("m2 method of class A");
    }
}
class B extends A{
    @Override
    void m1() {
        super.m1();
    }
    @Override
    void m2() {
        super.m2();
    }
    void m3(){
        System.out.println("m3 method of class B");
    }
    void m4(){
        System.out.println("m4 method of class B");
    }
}
public class Lab_Assignment_Q9_Activity_i {
    public static void main(String[] args) {
        B b1=new B();
        b1.m1();
        b1.m2();
        b1.m3();
        b1.m4();

    }
}
