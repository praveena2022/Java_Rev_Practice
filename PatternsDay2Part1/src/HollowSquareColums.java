import java.util.Scanner;

public class HollowSquareColums {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int col=sc.nextInt();
        pattern(n,col);
    }

    public static void pattern(int n,int col){

             for(int i=0;i<n;i++){
                 int c=1;
                 for(int j=0;j<n;j++){
                     if(j==n-1 && c<col){
                         System.out.print("*");
                         j=0;

                         c++;
                     }

                     if(i==0 ||i==n-1 ||j==0 || j==n-1)
                         System.out.print("*");
                     else
                         System.out.print(" ");
                 }
                 System.out.println();

         }
    }
}
