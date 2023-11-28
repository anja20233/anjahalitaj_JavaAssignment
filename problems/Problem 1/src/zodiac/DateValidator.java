package zodiac;

/**
 * The DateValidator class provides a method to validate the format and values of a date input.
 * It checks if the input string contains a valid day and month combination.
 */
public class DateValidator {

    /**
     * Validates the format and values of a date input.
     *
     * @param input The input string representing a date.
     * @return true if the date is valid, false otherwise.
     */
    public boolean isValidDate(String input) {
        // Validate the date format and values
        String[] parts = input.split(" ");

        // Check if the input has the correct format (day month)
        if (parts.length != 2) {
            return false; // Invalid format
        }

        try {
            int day = Integer.parseInt(parts[0]);
            String month = parts[1];

            // Check if the day is within the valid range (1 to 31)
            if (day < 1 || day > 31) {
                return false; // Day out of range
            }

            // Check if the month is one of the valid month names
            String[] validMonths = {"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};

            boolean validMonth = false;
            for (String valid : validMonths) {
                if (valid.equalsIgnoreCase(month)) {
                    validMonth = true;
                    break;
                }
            }

            return validMonth;
        } catch (NumberFormatException e) {
            return false; // Invalid day format
        }
    }
}
