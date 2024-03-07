/*
7. Find largest and smallest elements of an array.
*/

import java.util.Scanner;
class Assign07{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter size of array");
int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter elements of array");

for(int i=0;i<size;i++){
arr[i]=sc.nextInt();

}

int max=0,min=arr[0];

for(int i=0;i<arr.length;i++){
if(arr[i]<min)
min=arr[i];
if(arr[i]>max)
max=arr[i];

}

System.out.println("Largest Number in array is : "+max);
System.out.println("Smallest Number in array is : "+min);



}
}


