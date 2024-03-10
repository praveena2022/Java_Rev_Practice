import java.util.Scanner;
public class Average {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Number of students and subjects
            int numStudents = 8;
            int numSubjects = 3;

            // Array to store marks of students
            int[][] marks = new int[numStudents][numSubjects];

            // Array to store roll numbers
            int[] rollNumbers = new int[numStudents];

            // Input marks for each student
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter marks for Student " + (i + 1));
                for (int j = 0; j < numSubjects; j++) {
                    System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                    marks[i][j] = scanner.nextInt();
                }
                rollNumbers[i] = i + 1; // Roll numbers start from 1
            }

            // Calculate and print average marks for each student
            System.out.println("\nRoll Number\tAverage Marks");
            System.out.println("-----------------------------------");
            for (int i = 0; i < numStudents; i++) {
                int sum = 0;
                for (int j = 0; j < numSubjects; j++) {
                    sum += marks[i][j];
                }
                double average = (double) sum / numSubjects;
                System.out.printf("%-12d\t%.2f%n", rollNumbers[i], average);
            }


        }
    }

