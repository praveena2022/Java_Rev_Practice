/*
3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
*/

import java.util.Scanner;
class Assign03{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int size=20;
int arr[]=new int[size];

for(int i=0;i<size;i++){
arr[i]=sc.nextInt();

}


int evenNums=0,positiveNums=0,negativeNums=0,oddNums=0,zerosNums=0;
for(int i=0;i<arr.length;i++){
if(arr[i]==0)
zerosNums++;


if(arr[i]%2==0){
evenNums++;
if(arr[i]>0)
positiveNums++;
else
negativeNums++;
}
else if(arr[i]%2!=0){
oddNums++;
if(arr[i]>0)
positiveNums++;
else
negativeNums++;
}

}

System.out.println("Number of Positive Numbers : "+positiveNums);
System.out.println("Number of Negative Numbers : "+negativeNums);
System.out.println("Number of Even Numbers : "+evenNums);
System.out.println("Number of Odd Numbers : "+oddNums);
System.out.println("Number of Zeros : "+zerosNums);

}
}

