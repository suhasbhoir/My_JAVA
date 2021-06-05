package Lab.JAVAAssignment;
//Q3//iii.Write  a  class  MathDemo  with  methods  square()
// with  one parameter and add() with two parameters.
// Call these methods to get the output.

class MathDemo{
    static int square(int x){
        return x*x;
    }
    static int add(int x, int y){
        return x+y;
    }
}
public class Lab_Assignment_Q3_Activity_iii {
    public static void main(String[] args) {

        System.out.println(MathDemo.square(2));
        System.out.println(MathDemo.add(2,3));
    }
}
