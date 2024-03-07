/*
9. Sorting refers to arranging data in a particular format. Sort an array of integers in ascending order. One of the algorithm is selection sort. Use below explanation of selection sort to do this.
INITIAL ARRAY :
2	3	1	45	15
First iteration : Compare every element after first element with first element and if it is larger then swap. In first iteration, 2 is larger than 1. So, swap it.
1	3	2	45	15
Second iteration : Compare every element after second element with second element and if it is larger then swap. In second iteration, 3 is larger than 2. So, swap it.
1	2	3	45	15
Third iteration : Nothing will swap as 3 is smaller than every element after it.
1	2	3	45	15
Fourth iteration : Compare every element after fourth element with fourth element and if it is larger then swap. In fourth iteration, 45 is larger than 15. So, swap it.
1	2	3	15	45

*/


import java.util.Scanner;
class Assign09{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter size of array");
int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter elements of array");

for(int i=0;i<size;i++){
arr[i]=sc.nextInt();

}
System.out.println("Elements Before Swapping");

for(int val:arr)
System.out.print(val+" ");

System.out.println();

for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[j]<arr[i])
{
int temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}

}
}
System.out.println("Elements after swapping");
for(int val:arr)
System.out.print(val+" ");







}
}
