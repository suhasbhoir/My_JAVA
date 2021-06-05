package Lab.JAVAAssignment;
//Q10//Write an abstract class Car with methods start() and stop().
//Write a class Santro and Audi and override the methods.
// Write two interfaces SportsCar and CommercialCar and implement
// the appropriate interface on the appropriate class made in example 1.

abstract class Car{
    void start(){
        System.out.println("Engine Start");
    }
    void stop(){
        System.out.println("Engine Stop");
    }
}
interface SportsCar{
    void F1();
}
interface CommercialCar{
    void Hatchbacks();
}
class Santro extends Car implements CommercialCar{
    @Override
    public void start() {
        super.start();
    }
    @Override
    public void stop() {
        super.stop();
    }
    @Override
    public void Hatchbacks() {
        System.out.println("Santro is a Hatchback Car");
    }
}
class Audi extends Car implements SportsCar{
    @Override
    public void start() {
        super.start();
    }
   @Override
    public void stop() {
        super.stop();
    }
    @Override
    public void F1() {
        System.out.println("Audi sport is a F1 car");

    }
}
public class Lab_Assignment_Q10_Activity_i_ii {
    public static void main(String[] args) {
        Santro hcar1=new Santro();
        Audi fone1=new Audi();
        hcar1.start();
        hcar1.stop();
        hcar1.Hatchbacks();
        fone1.start();
        fone1.stop();
        fone1.F1();
    }
}
