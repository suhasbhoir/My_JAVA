import java.util.Scanner;

class Cylinder{
    private int Radius;
    private int Height;

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
    public double SurfaceArea(){
        return 2 * Math.PI * Radius * Height + 2 * Math.PI * Radius * Radius;
    }
    public double Vloume(){
        return Math.PI * Radius * Radius * Height;
    }


}
public class my_tut_11_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate total surface of area nad volume of cylinder");
        System.out.print("Enter Radius: ");
        int rds = sc.nextInt();
        System.out.print("Enter Height: ");
        int hit = sc.nextInt();


        Cylinder myCyl = new Cylinder();

        myCyl.setRadius(rds);
        System.out.println(myCyl.getRadius());
        myCyl.setHeight(hit);
        System.out.println(myCyl.getHeight());
        System.out.println("Cyilender Surface is: "+myCyl.SurfaceArea());
        System.out.println("Cyilender volume is: "+myCyl.Vloume());

    }
}
