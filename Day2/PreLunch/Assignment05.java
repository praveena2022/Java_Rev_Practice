/*
5.Print the following patterns using loop :
b.
1010101
10101 
  101  
   1   
*/
public class Assignment05{
    public static void main(String[] args) {
        int rows = 3; 
        
      
        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

           
            for (int k = 0; k < rows - i; k++) {
                if (k % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            
            System.out.println();
        }
    }
}
