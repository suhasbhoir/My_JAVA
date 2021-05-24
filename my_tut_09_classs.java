
class Employee{

    int salary;
    String empid;
    String First_name;
    String Last_name;

    public void prntint_name(){
        System.out.println("name of employee is " + First_name +" "+ Last_name);
    }

    public void print_emp(){
        System.out.println("Employee Id: " + empid);  }

    public void emp_sal(){
        System.out.println("Gross Salary is: " + salary);
    }

    public void prnt_line(){
        for (int i=0; i<=50; i++){
            System.out.print("_");
        }
        System.out.println();
    }
}

public class my_tut_09_classs {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.empid = "SB96654";
        emp2.empid = "SB00987";
        emp1.First_name = "Suhas";
        emp2.First_name = "Saee";
        emp1.Last_name = "Bhoir";
        emp2.Last_name = "Shinde";
        emp1.salary = 150000;
        emp2.salary = 50000;

//        System.out.println(emp1.empid);
//        System.out.println(emp2.empid);

        emp1.prntint_name();
        emp1.print_emp();
        emp1.emp_sal();
        emp1.prnt_line();
        emp2.prntint_name();
        emp2.print_emp();
        emp2.emp_sal();



    }




}
