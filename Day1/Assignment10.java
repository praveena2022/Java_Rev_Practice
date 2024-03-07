/*10. Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner.
*/

import java.util.*;
class Assignment10{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();

String rev="";

String ans=reverse(number,rev);
System.out.println(ans);



}

public static String reverse(int num,String rev){
int temp=num%10;
rev=rev+""+temp;
if(num<10)
return rev;
return reverse(num/10,rev);

}
}