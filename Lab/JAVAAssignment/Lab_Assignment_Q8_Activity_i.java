package Lab.JAVAAssignment;
//Q8//Write a class User with abstract methods pay() and receive(),
// later make two concrete class GoldUser and SilverUser,
// override the abstract method.

abstract class User{
    abstract public void pay();
    abstract public void receive();
}
class GoldUser extends User{
    @Override
    public void pay(){
        System.out.println("GoldUser: pay currant outstanding");
    }
    @Override
    public void receive() {
        System.out.println("GoldUser: receiving pending amount");
    }
}
class SilverUser extends User{
    @Override
    public void pay(){
        System.out.println("SilverUser: pay currant outstanding");
    }
    @Override
    public void receive(){
        System.out.println("SilverUser: receiving pending amount");
    }
}
public class Lab_Assignment_Q8_Activity_i {
    public static void main(String[] args) {
        GoldUser g1=new GoldUser();
        SilverUser s1=new SilverUser();
        g1.pay();
        g1.receive();
        s1.pay();
        s1.receive();


    }
}
