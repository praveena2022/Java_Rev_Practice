public class Triangle {

    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        double s = (double)(side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public int perimeter(){
        return side1+side2+side3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and printing the area of the triangle
        double area = triangle.area();
        System.out.println("Area of the triangle: " + area);

        // Calculating and printing the perimeter of the triangle
        int perimeter = triangle.perimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);

    }
}
