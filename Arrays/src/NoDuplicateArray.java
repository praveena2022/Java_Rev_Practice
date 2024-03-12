import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class NoDuplicateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();


        int[][] noDuplicateArray = createNoDuplicateArray(rows, columns, scanner);


        System.out.println("2D Array with no duplicate values:");
        printArray(noDuplicateArray);

        scanner.close();
    }

    public static int[][] createNoDuplicateArray(int rows, int columns, Scanner scanner) {
        int[][] array = new int[rows][columns];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int num;
                do {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    num = scanner.nextInt();
                    if (!set.add(num)) {
                        System.out.println("Duplicate value! Please enter a unique number.");
                        j--;

                    }
                } while (set.add(num)); // Continue prompting until a unique number is added to the set
                   array[i][j] = num;
            }


        }
        return array;
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
