//Left Down Triangle
import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
