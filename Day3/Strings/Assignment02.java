/*
2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
*/

import java.util.Scanner;
public class Assignment02{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

//String str="Goskula Vijay Praveena";
String str=sc.nextLine();

String arr[]=str.split(" ");

String nickname=arr[0].charAt(0)+"."+arr[1].charAt(0)+"."+arr[2];

System.out.println(nickname);//G.V.Praveena

}
}