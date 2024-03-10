import java.util.Scanner;

public class Area {
private double length;
private double breadth;


    public  void setDim(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public static double getArea(double length,double breadth){
        return (length*breadth);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area a=new Area();
        double length=sc.nextInt();
         double breadth=sc.nextInt();

        a.setDim(length,breadth);

        double area=getArea(length,breadth);
        System.out.println("area of rectangle is : "+area);


    }
}
