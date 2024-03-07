/*6. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.*/


import java.util.Scanner;
public class Assignment06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int sum=0;
        boolean quit = false;
       int count=0;

        while (!quit) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {

                quit = true;
            } else {
                    int num = Integer.parseInt(input);
                    sum+=num;
                    count++;
               
            }
        }

        
if(sum>0){
    double average = (double) sum / count;

            System.out.println("Average: " + average);
}
           
         else {
            System.out.println("No numbers were entered.");
        }

       
    }
}
