/*3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

class Assignment03{
public static void main(String[] args){

int number1=2345;
int number2=2345+8;
int number3=number2/3;
int number4=number3%5;
int result=number4*5;
System.out.println(result);
}
}
