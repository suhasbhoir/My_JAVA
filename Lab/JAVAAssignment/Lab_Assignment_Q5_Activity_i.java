package Lab.JAVAAssignment;

//Write a class Automobile with default constructor,
// write a class Plane which extends Automobile and has a default as well
// as parameterized constructor, write a class Airbus with a default
// constructor which extends Plane.

class Automobile{
    Automobile(){
        System.out.println("default constructor of Automobile class");
    }
}
class Plane extends Automobile{
    Plane(){
        System.out.println("default constructor of Plane class");

    }
    public int engine_id;
    public String engine;
    public String country_name;
    Plane(int engine_id, String engine, String country_name) {
        this.engine_id = engine_id;
        this.engine = engine;
        this.country_name = country_name;
    }
}
class Airbus extends Plane{
    Airbus(){
        System.out.println("default constructor of Airbus class");
    }
}
public class Lab_Assignment_Q5_Activity_i {
    public static void main(String[] args) {
        Automobile a1=new Automobile();
        Plane p1=new Plane(987010, "Rolls-Royce", "India");
        Airbus ab1=new Airbus();
    }
}
