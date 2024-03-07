/*
5. Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.
*/

import java.util.*;
public class Assignment05{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//String str=sc.next();

String str="bob has a radar plane";

String newString="";
String arr[]=str.split(" ");

for(int i=0;i<arr.length;i++){
boolean flag=palindrome(arr[i]);
if(flag){
for(int j=0;j<arr[i].length();j++)
newString+="*"+"";
}

else
newString+=" "+arr[i]+" ";
}
System.out.println(newString);

}

public static boolean palindrome(String s1){
StringBuilder sb=new StringBuilder(s1);
sb.reverse();
if(s1.equals(sb.toString()) && s1.length()>1)
return true;
return false;

}
}
