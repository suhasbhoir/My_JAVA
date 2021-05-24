
class MyEmployee{

    private int empid;
    private int salary;
    private String Firs_name;
    private String Last_name;

    public int get_empNo(){
        return empid;
    }
    public void set_empno(int en){
        this.empid = en;
    }
    public int get_sal(){
        return salary;
    }
    public void set_sal(int slr){
        this.salary = slr;
    }
    public String get_Fname(){
        return Firs_name;
    }
    public void set_Fname(String fname){
        this.Firs_name = fname;
    }
    public String get_Lname(){
        return Last_name;
    }
    public void set_Lname(String lname){
        this.Last_name = lname;
    }
    public void prnt_Line(){
        for (int i=0; i<=50; i++){
            System.out.print("_");
        }
        System.out.println();
    }

}
public class my_tut_10_accessSpe_Const {
    public static void main(String[] args) {

        MyEmployee emp1 = new MyEmployee();
        MyEmployee emp2 = new MyEmployee();
        emp1.set_empno(987456);
        emp1.set_sal(1520456);
        emp1.set_Fname("Suhas");
        emp1.set_Lname("Bhoir");

        emp2.set_empno(652143);
        emp2.set_sal(540032);
        emp2.set_Fname("Saee");
        emp2.set_Lname("Shinde");

        System.out.println(emp1.get_empNo());
        System.out.println(emp1.get_sal());
        System.out.println(emp1.get_Fname());
        System.out.println(emp1.get_Lname());
        emp1.prnt_Line();
        System.out.println(emp2.get_empNo());
        System.out.println(emp2.get_sal());
        System.out.println(emp2.get_Fname());
        System.out.println(emp2.get_Lname());
    }
}
