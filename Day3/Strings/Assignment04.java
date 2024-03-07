/*
4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.
*/

import java.util.*;
public class Assignment04{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.next();

int len=str.length();

boolean flag=true;

for(int i=0;i<str.length()/2;i++)
{
if(str.charAt(i)!=str.charAt(len-i-1))
flag=false;
break;
}


if(flag)
System.out.println("it is palindrome");
else
System.out.println("it is not palindrome");

//method 2 using stringbuilder reverse method
StringBuilder sb=new StringBuilder(str);
sb.reverse();
if(str.equals(sb.toString()))
System.out.println("it is palindrome");
else
System.out.println("it is not palindrome");

}

}