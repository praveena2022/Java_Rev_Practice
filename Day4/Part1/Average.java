import java.util.Scanner;

public class Average {
    int num1,num2,num3;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public int average(){
        return num1+num2+num3/3;
    }
    public void displayAverage(){
        System.out.println(average());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        Average avg=new Average(n1,n2,n3);
        avg.displayAverage();
    }
}
