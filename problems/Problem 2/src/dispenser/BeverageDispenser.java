package dispenser;

import java.util.ArrayList;
import java.util.List;

/**
 * The BeverageDispenser class represents a beverage dispenser machine that sells
 * Cola and Water. It handles user choices, coin insertion, and calculates the
 * balance and change owed to the user.
 */
public class BeverageDispenser {
    private int balance;
    private int change;
    private List<Integer> insertedCoins;

    /**
     * Constructs a BeverageDispenser object with initial balance, change, and an empty list of inserted coins.
     */
    public BeverageDispenser() {
        this.balance = 0;
        this.change = 0;
        this.insertedCoins = new ArrayList<>();
    }

    /**
     * Checks if the user's choice is valid (1 for Water, 2 for Cola).
     *
     * @param choice The user's choice.
     * @return true if the choice is valid, false otherwise.
     */
    public boolean isValidChoice(int choice) {
        return choice == 1 || choice == 2;
    }

    /**
     * Processes the user's choice and sets the balance accordingly.
     *
     * @param choice The user's choice (1 for Water, 2 for Cola).
     */
    public void processChoice(int choice) {
        this.balance = (choice == 1) ? 55 : 80;
    }

    /**
     * Gets the current balance.
     *
     * @return The balance.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Gets the change owed to the user.
     *
     * @return The change.
     */
    public int getChange() {
        return change;
    }

    /**
     * Checks if the balance has been fully paid.
     *
     * @return true if the balance is zero or less, indicating the payment is complete.
     */
    public boolean isPaid() {
        return balance <= 0;
    }

    /**
     * Inserts a coin into the machine, updates the balance, and handles invalid coins.
     *
     * @param coin The coin denomination (5, 10, 20, 50, or 100 Lek).
     */
    public void insertCoin(int coin) {
        if (isValidCoin(coin)) {
            insertedCoins.add(coin);
            balance -= coin;
        } else {
            System.out.println("$ Invalid coin, please try again!");
        }
    }

    /**
     * Calculates the change owed to the user and updates the balance.
     */
    public void calculateChange() {
        if (balance < 0) {
            this.change = Math.abs(balance);
            this.balance = 0;
        }
    }

    /**
     * Gets a formatted string listing the coins inserted by the user.
     *
     * @return A string in the format "You inserted 50, 20, and 20."
     */
    public String getInsertedCoins() {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < insertedCoins.size(); i++) {
            result.append(insertedCoins.get(i));
            if (i < insertedCoins.size() - 1) {
                result.append(", ");
            }
        }

        result.append(".");
        return result.toString();
    }

    /**
     * Checks if the coin denomination is valid.
     *
     * @param coin The coin denomination.
     * @return true if the coin is valid, false otherwise.
     */
    private boolean isValidCoin(int coin) {
        return coin == 5 || coin == 10 || coin == 20 || coin == 50 || coin == 100;
    }
}
