package dispenser;

import java.util.Scanner;

/**
 * The MainApplication class represents the main entry point for the beverage dispenser program.
 * It handles user interaction, choices, coin insertion, and displays the transaction details.
 */
public class MainApplication {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a dispenser object to manage beverage dispensing transactions
        BeverageDispenser dispenser = new BeverageDispenser();

        // Display the available beverage choices and their prices
        System.out.println("$ Water = 55 Lek , Cola = 80 Lek");
        System.out.print("$ What would you like to drink (Enter 1 for Water, 2 for Cola)? ");

        int choice;

        // Prompt the user for a valid beverage choice
        while (true) {
            choice = scanner.nextInt();
            if (dispenser.isValidChoice(choice)) {
                break;
            } else {
                System.out.print("$ Incorrect input, please try again! ");
            }
        }

        // Process the user's beverage choice
        dispenser.processChoice(choice);

        // Accept coins from the user until the balance is fully paid
        while (!dispenser.isPaid()) {
            System.out.println("$ Balance due " + dispenser.getBalance() + " Lek");
            System.out.print("$ Insert coin: ");
            int coin = scanner.nextInt();
            dispenser.insertCoin(coin);
        }

        // Complete the payment, calculate change, and display transaction details
        dispenser.calculateChange();
        System.out.println("$ Payment complete. Change owed " + dispenser.getChange() + " Lek.");
        System.out.println("$ You inserted: " + dispenser.getInsertedCoins());
        System.out.println("$ Change owed " + dispenser.getChange() + " Lek.");
        System.out.println("$ Enjoy your drink.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
