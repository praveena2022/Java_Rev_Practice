/*
2. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
*/

import java.util.*;
public class Assignment02{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter marks of student");
int marks=sc.nextInt();

String result=findGrade(marks);
System.out.println("Student Grade is : "+result);




}

public static String findGrade(int marks){
if(marks<=40)
return "Fail";
else if(marks>=41 && marks<=50)
return "DD";
else if(marks>=51 && marks<=60)
return "CD";

else if(marks>=61 && marks<=70)
return "BC";

else if(marks>=71 && marks<=80)
return "BB";

else if(marks>=81 && marks<=90)
return "AB";

else
return "AA";

}




}

