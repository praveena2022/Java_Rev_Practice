/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable
*/

class Assignment05{
public static void main(String[] args){
int a=6;
int b=8;
System.out.println("Numbers before swapping are a "+a+" b is "+b);
int temp=a;
a=b;
b=temp;

System.out.println("Numbers before swapping are a "+a+" b is "+b);

}
}