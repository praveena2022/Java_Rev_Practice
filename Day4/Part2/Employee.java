import java.util.Scanner;
import java.util.Date;

public class Employee {
        String name;
        double salary;
        Date dateOfJoining;

        // Constructor
        Employee(String name, double salary, Date dateOfJoining) {
            this.name = name;
            this.salary = salary;
            this.dateOfJoining = dateOfJoining;
        }



        public static void main(String[] args) {
            // Creating an array of Employee objects
            Employee[] employees = new Employee[10];

            // Initializing employee objects with name, salary, and date of joining
            employees[0] = new Employee("John", 50000, new Date(121, 1, 15)); // Note: Date format: year, month (0-indexed), day
            employees[1] = new Employee("Alice", 60000, new Date(120, 5, 20));
            employees[2] = new Employee("Bob", 55000, new Date(119, 10, 10));
            employees[3] = new Employee("Mary", 52000, new Date(119, 3, 5));
            employees[4] = new Employee("David", 53000, new Date(118, 8, 25));
            employees[5] = new Employee("Emily", 58000, new Date(118, 0, 12));
            employees[6] = new Employee("Michael", 51000, new Date(121, 9, 8));
            employees[7] = new Employee("Sophia", 54000, new Date(120, 7, 30));
            employees[8] = new Employee("James", 57000, new Date(119, 11, 18));
            employees[9] = new Employee("Emma", 59000, new Date(118, 4, 22));

            // Printing employee details
            System.out.println("Employee Details:");
            System.out.println("Name\t\tSalary\t\tDate of Joining");
            System.out.println("-----------------------------------------------");
            for (Employee emp : employees) {
                System.out.printf("%-10s\t$%-7.2f\t%s%n", emp.name, emp.salary, emp.dateOfJoining.toString());
            }
        }
        }

