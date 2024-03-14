import java.util.Scanner;

public class RightTriangleNumPattern {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int n = sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}