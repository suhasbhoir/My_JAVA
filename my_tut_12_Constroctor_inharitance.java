
class Employee_Base{
    public Employee_Base() {
        int x;
        System.out.println("I am a Employee_Base class constructor");
    }
    public Employee_Base(int x) {
        System.out.println("I am a Employee_Base class constructor with value " + x);
    }
}
class Employee_Derived extends Employee_Base{
    public Employee_Derived() {
        System.out.println("I am a Employee_Derived class constructor");
    }

    public Employee_Derived(int x, int y) {
        super(x);
        System.out.println("I am a Employee_Derived class constructor with value " + y);
    }
}
class Child_Derived extends Employee_Derived{
    public Child_Derived() {
        System.out.println("I am a Child_Derived class constructor");
    }

    public Child_Derived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a Child_Derived class constructor with value " + z);
    }
}

public class my_tut_12_Constroctor_inharitance {
    public static void main(String[] args) {
        Employee_Base myemp = new Employee_Base(102);
        Employee_Derived myempd =new Employee_Derived(99, 55);
        Child_Derived chiDri = new Child_Derived(10, 11, 12);


    }
}
