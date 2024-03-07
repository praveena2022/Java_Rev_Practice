/* 9. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.
*/


import java.util.*;
class Assignment09{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int sum=0;

int res=func(number,sum);
System.out.println(res);

}
public static int func(int n,int sum){

if(n<10)
return sum+n;
int temp=n%10;
sum+=temp;
return func(n/10,sum);


}


}
