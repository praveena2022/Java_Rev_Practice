import java.util.Scanner;

public class HollowSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }

            }
            else
            {
                System.out.print("*");
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}