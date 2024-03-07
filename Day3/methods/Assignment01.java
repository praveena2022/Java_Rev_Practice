/*1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.*/

import java.util.*;
public class Assignment01{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int maxNumber=max(a,b,c);
int minNumber=min(a,b,c);
System.out.println(maxNumber);
System.out.println(minNumber);


}

public static int max(int a,int b,int c){
if(a>b && a>c)
return a;
else if(b>c && b>a)
return b;
else 
return c;
}

public static int min(int a,int b,int c){
if(a<c && a<b)
return a;
else if(b<a && b<c)
return b;
else 
return c;
}
}
