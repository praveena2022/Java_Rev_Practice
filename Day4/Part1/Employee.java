import java.util.Scanner;

class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Constructor
    Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.printf("%-10s %-20s %-20s %-20s%n", name, yearOfJoining, salary, address);
    }


    public static void main(String[] args) {
        // Creating objects of Employee class
        Employee emp1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
        Employee emp2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
        Employee emp3 = new Employee("John", 1999, 55000, "26B- WallsStreet");

        // Printing employee information
        System.out.printf("%-10s %-20s %-20s %-20s%n", "Name", "Year of Joining", "Salary", "Address");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}

