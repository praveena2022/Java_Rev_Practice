/*8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.
*/

import java.util.*;
class Assignment08{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int sum=0;
int firstNumber=number/10000;

int temp=number%100;
int lastSecondNumber=temp/10;

sum=firstNumber+lastSecondNumber;
System.out.println(sum);

}
}