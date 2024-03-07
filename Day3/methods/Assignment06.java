/*
6. Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3]. 

*/


public class Assignment06 {
    public static void main(String[] args) {
        System.out.print("Perfect Numbers from 1 to 1000 are ");
        
        for (int i = 2; i <= 1000; i++) {
            if (isPerfect(i, 1, 0))
                System.out.print(i + " ");
        }
    }

    public static boolean isPerfect(int n, int divisor, int sum) {
        if (divisor <= n / 2) {
            if (n % divisor == 0) {
                sum += divisor;
            }
            return isPerfect(n, divisor + 1, sum);
        } else {
            return sum == n;
        }
    }
}
