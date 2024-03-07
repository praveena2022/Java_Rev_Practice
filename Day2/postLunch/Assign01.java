/* 1. Take 10 integer inputs from user and store them in an array and print them on screen. */


import java.util.Scanner;
class Assign01{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int size=10;
int arr[]=new int[size];
for(int i=0;i<size;i++){
 arr[i]=sc.nextInt();
}
for(int value:arr){
System.out.println(value);

}

}
}
