/*
7. Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.
*/

import java.util.*;
public class Assignment07{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String str="A batman with bat";
String s1="bat";
String s2="snow";

String str2="";
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++){
if(s1.equals(arr[i]))
str2=str.replace(s1,s2);

}
System.out.println(str2);
}
}