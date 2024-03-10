import java.util.Scanner;

class BankAccount2{
    private static int accountNumberCounter = 1000;
    private static int totalTransactions = 0;

    private int accountNumber;
    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int transactions;

    public BankAccount2(String name, String address, String accountType, double balance) {
        this.accountNumber = accountNumberCounter++;
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.transactions = 0;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions++;
        totalTransactions++;
        System.out.println("Deposit Successful.");
        System.out.println("Updated Balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions++;
            totalTransactions++;
            System.out.println("Withdrawal Successful.");
            System.out.println("Updated Balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated successfully.");
    }

    public static int getTotalTransactions() {
        return totalTransactions;
    }
}

class UserInputHandler {
    public static BankAccount2 getBankAccountFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        return new BankAccount2(name, address, accountType, balance);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        BankAccount2 depositor = UserInputHandler.getBankAccountFromUser();

        boolean continueTransaction = true;

        while (continueTransaction) {
            System.out.println("Select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Information");
            System.out.println("4. Change Address");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    depositor.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    depositor.withdraw(withdrawAmount);
                    break;
                case 3:
                    depositor.displayInfo();
                    break;
                case 4:
                    System.out.print("Enter the new address: ");
                    String newAddress = scanner.nextLine();
                    depositor.changeAddress(newAddress);
                    break;
                case 5:
                    continueTransaction = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }


    }
}
