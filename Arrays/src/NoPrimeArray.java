import java.util.Scanner;

public class NoPrimeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();


        int[][] noPrimeArray = createNoPrimeArray(rows, columns, scanner);

        // Display the array
        System.out.println("2D Array with no prime numbers:");
        printArray(noPrimeArray);

        scanner.close();
    }

    public static int[][] createNoPrimeArray(int rows, int columns, Scanner scanner) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int num;
                do {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println("Please enter a non-prime number.");
                    }
                } while (isPrime(num));
                array[i][j] = num;
            }
        }
        return array;
    }

    public  static  boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
