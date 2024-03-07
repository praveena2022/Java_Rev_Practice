/*
2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
*/

import java.util.Scanner;
class Assign02{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int size=10;
int arr[]=new int[size];

for(int i=0;i<size;i++){
 arr[i]=sc.nextInt();
}

System.out.println("Enter a number");
int number=sc.nextInt();
boolean flag=false;

for(int i=0;i<size;i++){
if(number==arr[i]){
flag=true;
break;}
}

if(flag)
System.out.println("The given number "+number+" is Present in the array");
else
System.out.println("The given number "+number+" is not Present in the array");





}
}
 