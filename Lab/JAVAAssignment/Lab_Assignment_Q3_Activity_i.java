package Lab.JAVAAssignment;
//Q3//i.Write  a  Java  class  Employee  with  variables  name,  age, gender
// write setter and getter methods for it.

class Employee{
    String name;
    int age;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class Lab_Assignment_Q3_Activity_i {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setName("Keshwan R.");
        emp1.setAge(35);
        emp1.setGender("Male");
        System.out.println("Name: "+emp1.getName());
        System.out.println("Age: "+emp1.getAge());
        System.out.println("Gender: "+emp1.getGender());
    }
}
