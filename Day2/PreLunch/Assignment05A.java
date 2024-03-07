/*
5. 
Print the following patterns using loop :
a.
*
**
***
****
 
b.
1010101
10101 
  101  
   1   

*/
import java.util.Scanner;
class Assignment05A{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
System.out.print("*");

}
System.out.println();


}


}
}