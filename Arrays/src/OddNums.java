import java.util.Scanner;

public class OddNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Odd numbers of 2d array are: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]%2!=0)
                    System.out.print(arr[i][j]+" ");
            }
        }
    }



}
