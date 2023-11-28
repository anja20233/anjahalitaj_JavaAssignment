package zodiac;

/**
 * The Date class represents a date with a day and a month. It provides methods to
 * retrieve the day, month, and the corresponding Zodiac sign based on the date.
 */
public class Date {
    private int day;
    private String month;

    /**
     * Constructs a Date object by parsing the input string.
     *
     * @param input The input string containing the day and month.
     */
    public Date(String input) {
        String[] parts = input.split(" ");
        this.day = Integer.parseInt(parts[0]);
        this.month = parts[1];
    }

    /**
     * Gets the day of the date.
     *
     * @return The day of the date.
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets the month of the date.
     *
     * @return The month of the date.
     */
    public String getMonth() {
        return month;
    }

    /**
     * Determines the Zodiac sign based on the day and month of the date.
     *
     * @return The Zodiac sign corresponding to the date.
     */
    public String getZodiacSign() {
        // Determine the zodiac sign based on the day and month
        if ((month.equalsIgnoreCase("March") && day >= 21) || (month.equalsIgnoreCase("April") && day <= 19)) {
            return "Aries";
        } else if ((month.equalsIgnoreCase("April") && day >= 20) || (month.equalsIgnoreCase("May") && day <= 20)) {
            return "Taurus";
        } else if ((month.equalsIgnoreCase("May") && day >= 21) || (month.equalsIgnoreCase("June") && day <= 20)) {
            return "Gemini";
        } else if ((month.equalsIgnoreCase("June") && day >= 21) || (month.equalsIgnoreCase("July") && day <= 22)) {
            return "Cancer";
        } else if ((month.equalsIgnoreCase("July") && day >= 23) || (month.equalsIgnoreCase("August") && day <= 22)) {
            return "Leo";
        } else if ((month.equalsIgnoreCase("August") && day >= 23) || (month.equalsIgnoreCase("September") && day <= 22)) {
            return "Virgo";
        } else if ((month.equalsIgnoreCase("September") && day >= 23) || (month.equalsIgnoreCase("October") && day <= 22)) {
            return "Libra";
        } else if ((month.equalsIgnoreCase("October") && day >= 23) || (month.equalsIgnoreCase("November") && day <= 21)) {
            return "Scorpio";
        } else if ((month.equalsIgnoreCase("November") && day >= 22) || (month.equalsIgnoreCase("December") && day <= 21)) {
            return "Sagittarius";
        } else if ((month.equalsIgnoreCase("December") && day >= 22) || (month.equalsIgnoreCase("January") && day <= 19)) {
            return "Capricorn";
        } else if ((month.equalsIgnoreCase("January") && day >= 20) || (month.equalsIgnoreCase("February") && day <= 18)) {
            return "Aquarius";
        } else if ((month.equalsIgnoreCase("February") && day >= 19) || (month.equalsIgnoreCase("March") && day <= 20)) {
            return "Pisces";
        }
        return "Unknown Sign";
    }
}
