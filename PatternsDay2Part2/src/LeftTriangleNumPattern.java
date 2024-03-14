import java.util.Scanner;

public class LeftTriangleNumPattern {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int n = sc.nextInt();
        pattern(n);

    }
    public static void pattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
