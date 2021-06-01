package Lab.JAVAAssignment;
//Q11//Make an Interface CE which have methods call(),
//sms (), Make another interface ISO which have methods
// radiation() and sound().
// Make two classes IPhone and Galaxy and make them
// implement both the interfaces.

interface CE{
    void call();
    void sms();
}
interface ISO{
    int increasing=0;
    int decreasing=0;
    void radiation();
    void sound(int increasing, int decreasing);
}
class IPhone implements CE, ISO{
    @Override
    public void call() {
        System.out.println("Using Iphone7---> Call is connecting...");
    }
    @Override
    public void sms() {
        System.out.println("Using Iphone7---> SMS is being sent...");
    }
    @Override
    public void radiation() {
        System.out.println("Iphone7 Sar is: 1.34 W/kg");
    }
    @Override
    public void sound(int increasing, int decreasing) {
        System.out.println("Iphone ring tone sound increasing by: "+increasing+" and decreasing by: "+decreasing);
    }
}
class Galaxy implements CE, ISO{
    @Override
    public void call() {
        System.out.println("Using Samsung Galaxy---> Call is connecting...");
    }
    @Override
    public void sms() {
        System.out.println("Using Samsung Galaxy---> SMS is being sent...");
    }
    @Override
    public void radiation() {
        System.out.println("Samsung Galaxy Sar is: 1.54 W/kg");
    }
    @Override
    public void sound(int increasing, int decreasing) {
        System.out.println("Iphone ring tone sound decreasing by: "+ decreasing+" and increasing by: "+increasing);
    }
}
public class Lab_Assignment_Q11_Activity_i {
    public static void main(String[] args) {
        IPhone ip7=new IPhone();
        Galaxy gal=new Galaxy();
        ip7.call();
        ip7.sms();
        ip7.radiation();
        ip7.sound(20, 0);
        gal.call();
        gal.sms();
        gal.radiation();
        gal.sound(30,0);


    }
}
