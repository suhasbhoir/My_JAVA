package Lab.JAVAAssignment;
//Write a Java class for following methods display()
// --Display number from 1 to 100 using while loop in Java
// fibonacci() --Prints Fibonacci series till 100

class CountNumAndFibo{
    static void display(){
        int num = 100;
        for (int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
    static void fibonacci(){
        int num1=0,num2=1,count=100;
        System.out.println("\n"+num1);
        System.out.println("\n"+num2);
        for (int i=2; i<=count; i++){
            int num3 = num1+num2;
            System.out.println("\n"+num3);
            num1=num2;
            num2=num3;
        }
    }
}
class Lab_Assignment_Q4_Activity_i {
    public static void main(String[] args) {
        CountNumAndFibo.display();
        CountNumAndFibo.fibonacci();
    }
}
