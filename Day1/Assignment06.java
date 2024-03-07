/*6. Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/

import java.util.*;
class Assignment06{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value in fahrenheit");
double Fahrenheit=sc.nextDouble();
double celciusValue=(Fahrenheit-32)*5/9;
System.out.println(celciusValue);

}
}
