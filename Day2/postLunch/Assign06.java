 /*6. Initialize and print all elements of a 2D array. */

import java.util.Scanner;
class Assign06{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter row size of 2d array");
int rowSize=sc.nextInt();

System.out.println("Enter row size of 2d array");
int columnSize=sc.nextInt();

int arr[][]=new int[rowSize][columnSize];

System.out.println("Enter elements of 2d array");

for(int i=0;i<rowSize;i++)
{
for(int j=0;j<columnSize;j++){
arr[i][j]=sc.nextInt();
}
}

for(int i=0;i<rowSize;i++)
{
for(int j=0;j<columnSize;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();

}


}
}
