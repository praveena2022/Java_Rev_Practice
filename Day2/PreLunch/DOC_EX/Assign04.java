/*
4. Take 10 integers from keyboard using loop and print their average value on the screen.
 
*/
/** 
* <h1>Take 10 integers from keyboard using loop and print their average value on the screen.!</h1> 
* The FindAvg program implements an application that 
* simply calculates average of 10 integers and Prints 
* the output on the screen. 
* 
* @author  Praveena 
* @version 8.0
* @since   2024-03-06
*/

import java.util.Scanner;
public class Assign04{

    /** 
    * This method is used to find average of 10 integers. 
    */
public static void main(String[] args){
 /** 
    * This is the main method which makes use of findAvg method. 
    * @param args Unused. 
    * @return Nothing. 
    */
Scanner sc=new Scanner(System.in);
int sum=0;

for(int i=1;i<=10;i++){
int value=sc.nextInt();
sum+=value;

}
double average=(double)sum/10;
System.out.println(average);

}
}
