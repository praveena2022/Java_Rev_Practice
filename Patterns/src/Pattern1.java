import java.util.Scanner;

/*
pattern1
*
**
***
****
*****

 */
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);

    }

    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
