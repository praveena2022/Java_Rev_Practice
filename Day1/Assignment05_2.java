/*Swap numbers
B - second program without using any third variable */



class Assignment05_2{
public static void main(String[] args){
int a=6;
int b=8;
System.out.println("Numbers before swapping are a "+a+" b is "+b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("Numbers before swapping are a "+a+" b is "+b);

}
}