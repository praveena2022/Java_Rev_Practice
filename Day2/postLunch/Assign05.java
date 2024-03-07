/* 5. Write a program to find the sum and product of all elements of an array.
 */


import java.util.Scanner;
class Assign05{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter size of array");
int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter elements of array");


int sum=0,mul=1;
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
sum+=arr[i];
mul*=arr[i];

}


System.out.println("Sum of elements of array : "+sum);
System.out.println("product of elements of array : "+mul);

}
}
