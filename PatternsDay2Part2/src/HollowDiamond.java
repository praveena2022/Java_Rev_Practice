import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                if (j == n + i - 1 || j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {

                if (j == i || j == (2 * n) - i - 2)
                    System.out.print("*");
                else
                    System.out.print(" ");


            }
            System.out.println();
        }
    }
}

