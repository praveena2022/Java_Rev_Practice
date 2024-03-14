import java.util.Scanner;

public class HollowSquareTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        pattern(n, rows, cols);
    }

    public static void pattern(int n, int rows, int cols) {



        int r=1;
                for (int j = 0; j < n; j++) {

                    int c = 1;

                    for (int s = 0; s < n; s++) {
                        if(s==n-1 && c<cols) {
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


