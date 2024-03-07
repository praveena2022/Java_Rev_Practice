/*
4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
*/

import java.util.Scanner;
class Assign04{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int size=10;
int arr[]=new int[size];

for(int i=0;i<size;i++){
arr[i]=sc.nextInt();

}

int arr2[]=new int[arr.length];
for(int j=0;j<arr.length;j++){
arr2[j]=arr[arr.length-j-1];
}

for(int i=0;i<arr2.length;i++)
System.out.print(arr2[i]+" ");

}}
