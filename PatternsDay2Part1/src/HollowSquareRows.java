import java.util.Scanner;

public class HollowSquareRows {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rows=sc.nextInt();
        pattern(n,rows);
    }

    public static void pattern(int n,int rows){
        for(int k=0;k<rows;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0 ||i==n-1 ||j==0 || j==n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
