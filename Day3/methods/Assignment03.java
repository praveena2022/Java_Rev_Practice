/*
3. Print the multiplication table of 15 using recursion.
*/

public class Assignment03{
    public static void main(String[] args) {
int number=15;
table(15,1);


}

public static void table(int n,int i){

System.out.println(n+" * "+i+" = "+n*i);
if(i>=10)
return;
else
table(n,i+1);
}
}