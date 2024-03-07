/*
1. Write a program to check if the letter 'e' is present in the word 'Umbrella'. */


public class Assignment01{
    public static void main(String[] args) {

String str="Umbrella";
boolean flag=false;
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='e')
flag=true;
break;

}
if(flag)
System.out.println("Yes it is present");
else
System.out.println("Yes it is present");

//method 2
//using index method

if(str.indexOf('e')!=-1)
System.out.println("Yes it is present");
else
System.out.println("Yes it is present");




}

}
