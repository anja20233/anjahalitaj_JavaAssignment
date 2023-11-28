package zodiac;

import java.util.Scanner;

/**
 * The main application class for computing Zodiac signs based on user input.
 * This program takes user input for a date and outputs the corresponding Zodiac sign.
 * The input date is entered as "day month," and the program validates the input.
 * The user can exit the program by entering 'q'.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inform the user how to exit the program
        System.out.println("$ (Press q to exit)");

        while (true) {
            System.out.print("$ Enter date: ");
            String input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("q")) {
                System.out.println("$ Exiting program.");
                break;
            }

            // Validate the entered date
            DateValidator dateValidator = new DateValidator();
            if (dateValidator.isValidDate(input)) {
                // If the date is valid, compute and display the Zodiac sign
                Date date = new Date(input);
                String zodiacSign = date.getZodiacSign();
                System.out.println("$ Your zodiac sign is " + zodiacSign);
            } else {
                // If the date is invalid, prompt the user to check their input
                System.out.println("$ Incorrect date! Check your input.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
