/*
8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.
*/

public class Assignment08{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int i = 100; i <= 500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        return sum == originalNum;
    }
}
