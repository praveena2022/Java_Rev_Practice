/*4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/

import java.util.*;
class Assignment04{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int subject1=sc.nextInt();
int subject2=sc.nextInt();
int subject3=sc.nextInt();

double totalMarks=subject1+subject2+subject3;
System.out.println("Total marks of Robert is "+totalMarks);

double percentage=(totalMarks/300)*100;
System.out.println("Percentage marks of Robert is "+percentage);


}
}

