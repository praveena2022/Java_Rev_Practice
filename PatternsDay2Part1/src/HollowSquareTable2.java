import java.util.Scanner;

public class HollowSquareTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hollow Square size");
        int n = sc.nextInt();
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Colums");
        int cols = sc.nextInt();
        pattern(n, rows, cols);
    }

    public static void pattern(int n, int rows, int cols) {



        int r=1;
        for (int j = 0; j < n; j++) {

            int c = 1;

            for (int s = 0; s < n+1; s++) {
                if(s==n && c<cols) {
                    c++;
                    s = -1;
                }
                if (j == 0 || j == n - 1 || s == 0 || s == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(j==n-1 && r<rows){
                j=-1;
                r++;
            }

            System.out.println();
        }





    }

}
