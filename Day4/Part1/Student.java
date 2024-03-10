class Student {
    String name;
    int roll_no;
    int phoneNo;
    String address;

    // Constructor
    Student(String name, int roll_no,int phoneNo,String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNo=phoneNo;
        this.address=address;
    }

    // Method to print student details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No : " + phoneNo);
        System.out.println("Address : " + address);
    }



    public static void main(String[] args) {
        // Creating an object of class Student and assigning values
        Student john = new Student("John", 2,3467778,"mncl");

        // Printing details of John
        System.out.println("Details of John:");
        john.printDetails();
        System.out.println();

        // Creating another object of class Student and assigning values
        Student sam = new Student("Sam", 1,58878554,"Telangana");

        // Printing details of Sam
        System.out.println("Details of Sam:");
        sam.printDetails();
    }
}
