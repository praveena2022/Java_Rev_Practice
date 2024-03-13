import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n){
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(j==0 || i==n-1 || i==j )
                   System.out.print("*");
               else
                   System.out.print(" ");
           }

           System.out.println();

        }


        }
    }

