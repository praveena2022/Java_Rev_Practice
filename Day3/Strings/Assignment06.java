/*
6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String)
*/

import java.util.Scanner;

public class Assignment06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of 10 friends:");

        String[] friends = new String[10];

        
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Friend " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }

      
        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (friends[i].compareTo(friends[j]) > 0) {
                    // Swap elements
                    String temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
            }
        }

      
        System.out.println("\nFriends sorted alphabetically:");
        for (String friend : friends) {
            System.out.println(friend);
        }

      
    }
}
