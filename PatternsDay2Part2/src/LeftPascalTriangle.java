import java.util.Scanner;

public class LeftPascalTriangle {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of PascalTraingle");
        int n = sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for (int j = n; j < (2*n)-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++)
                System.out.print("*");
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
