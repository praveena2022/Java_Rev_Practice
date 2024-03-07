/*
8. Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest

*/

import java.util.Scanner;
class Assign08{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter size of array");
int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter elements of array");

for(int i=0;i<size;i++){
arr[i]=sc.nextInt();

}

int max=0,min=arr[0],ind=0;
for(int i=0;i<arr.length;i++){
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}



int secMin=Integer.MAX_VALUE;


for(int i=0;i<arr.length;i++){
if(arr[i] <secMin && arr[i] > min)
secMin=arr[i];
}
System.out.println(secMin);

System.out.println("maximum difference = higest-lowest : "+(max-min));

System.out.println("minimum difference = second lowest - lowest : "+(secMin-min));




}
}