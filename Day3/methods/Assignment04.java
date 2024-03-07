/*
4. Using recursion, define a method to know nth term of a Fibonacci series.
Nth term of Fibonacci series is
F(n) = F(n-1)+(n-2)
F(0) = 0
F(1) = 1
F(2) = F(1)+(0) = 1+0 = 1
F(3) = F(2)+(1) = 1+1 = 2
F(4) = F(3)+(2) = 2+1 = 3
*/


import java.util.*;
public class Assignment04{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int firstNum=0;
int secNum=1;

//here i==2 because we have first and second terms already.
if(n==0)
System.out.println("The "+n+"th term of fibonacci series is : "+firstNum);
else if(n==1)
System.out.println("The "+n+"th term of fibonacci series is : "+secNum);

else{
int result=fib(0,1,n,2);
System.out.println("The "+n+"th term of fibonacci series is : "+result);
}

}

public static int fib(int first,int second,int n,int i){

int sum=first+second;
if(i==n)
return sum;
else
return fib(second,sum,n,i+1);
}
}