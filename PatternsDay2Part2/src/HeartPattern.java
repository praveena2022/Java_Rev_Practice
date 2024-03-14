import java.util.Scanner;

public class HeartPattern {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of Heart");
        int n = sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {

               if(i==n-1) {
                   for(int k=0;k<(2*n)-1;k++)
                   System.out.print("*");
                   System.out.println();
               }
               if(i==n-2){
                   System.out.print(" ");
                   for(int j=0;j<n-2;j++){
                       System.out.print("*");
                   }
                   System.out.print(" ");
                   for(int j=0;j<n-2;j++){
                       System.out.print("*");
                   }
                   System.out.println();
               }

           // System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*n)-(2*i)-1;k++)
                System.out.print("*");
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
