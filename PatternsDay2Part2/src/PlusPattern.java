import java.util.Scanner;

public class PlusPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int n = sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++) {
                if (j == n / 2 || i==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
