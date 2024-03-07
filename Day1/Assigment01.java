/*1. Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.*/

class Assigment01{
public static void main(String[] args)
{
int length=Integer.parseInt(args[0]);
int breadth=Integer.parseInt(args[1]);
int area=0;
int perimeter=0;
area=length*breadth;
perimeter=2*(length+breadth);
System.out.println("Area of rectangle of given length "+length+" and breadth "+breadth+" is "+area);
System.out.println("Perimeter of rectangle of given length "+length+" and breadth "+breadth+" is "+perimeter);
}
}

