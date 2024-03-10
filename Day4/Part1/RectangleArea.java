import java.util.Scanner;

public class RectangleArea {

    int length;
    int breadth;

    public RectangleArea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int breadth=sc.nextInt();
        RectangleArea ra=new RectangleArea(length,breadth);
        int area=ra.returnArea();
        System.out.println(area);
    }
}
