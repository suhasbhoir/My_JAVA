package Lab.JAVAAssignment;
//Q3//i.Write  a  class  mobile  with  methods  call()  and  sms().
// Write  a class Demo and access it.

class mobile{
    static void call(){

        System.out.println("Calling...");
    }
    static void sms(){
        System.out.println("Sending a message...");
    }
}
class demo extends mobile{
    static void display(){
        System.out.println("Entering to the demo class");
    }

}
public class Lab_Assignment_Q3_Activity_ii {
    public static void main(String[] args) {
        //accessing mobile class using demo class

        demo.display();
        demo.call();
        demo.sms();
    }
}
