/*
3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/


import java.util.Scanner;
class Assignment03{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number of classes held");
int noOfClassesHeld=sc.nextInt();

System.out.println("Enter Number of classes attended");
int numberOfClassesAttended=sc.nextInt();

double percentage = ((double) numberOfClassesAttended / noOfClassesHeld) * 100;
System.out.println("Your Percentage is : "+percentage);


if(percentage>75){
System.out.println("Allowed to Sit in Exam");

}
else{

System.out.println("Do u have medical cuase,type YES or NO");
String medicalCause=sc.next();

if(medicalCause.equals("YES") || medicalCause.equals("yes"))
System.out.println("Allowed to Sit in Exam");
else
System.out.println("Not allowed to Sit in Exam");
}
}
}
