import java.util.ArrayList;
import java.util.Scanner;

class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueID;

    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void displayEntry() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
}

public class Directory {
    private ArrayList<DirectoryEntry> directoryEntries;

    public Directory() {
        directoryEntries = new ArrayList<>();
    }

    public void createEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        DirectoryEntry entry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
        directoryEntries.add(entry);
        System.out.println("Entry created successfully.");
    }

    public void editEntry(String uniqueID, String newName, String newAddress, String newTelephoneNumber, String newMobileNumber, String newHeadOfFamily) {
        for (DirectoryEntry entry : directoryEntries) {
            if (entry.getUniqueID().equals(uniqueID)) {
                entry.setName(newName);
                entry.setAddress(newAddress);
                entry.setTelephoneNumber(newTelephoneNumber);
                entry.setMobileNumber(newMobileNumber);
                entry.setHeadOfFamily(newHeadOfFamily);
                System.out.println("Entry edited successfully.");
                return;
            }
        }
        System.out.println("Entry not found with the given Unique ID.");
    }

    public void searchEntry(String keyword) {
        System.out.println("Search Results:");
        for (DirectoryEntry entry : directoryEntries) {
            if (entry.getName().contains(keyword) || entry.getAddress().contains(keyword) || entry.getTelephoneNumber().contains(keyword) || entry.getMobileNumber().contains(keyword) || entry.getHeadOfFamily().contains(keyword) || entry.getUniqueID().contains(keyword)) {
                entry.displayEntry();
                System.out.println();
            }
            else
                System.out.println("the keyword you are asking for is not present");
        }
    }

    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create an entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Telephone Number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter Head of Family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter Unique ID: ");
                    String uniqueID = scanner.nextLine();
                    directory.createEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    break;
                case 2:
                    System.out.print("Enter Unique ID of the entry to edit: ");
                    String editID = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter New Telephone Number: ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter New Mobile Number: ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter New Head of Family: ");
                    String newHeadOfFamily = scanner.nextLine();
                    directory.editEntry(editID, newName, newAddress, newTelephoneNumber, newMobileNumber, newHeadOfFamily);
                    break;
                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.searchEntry(keyword);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');


    }
}
