/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable month (1-12).
 *    - Use a switch statement to print the corresponding month name.
 *
 * 2. Create a char variable grade ('A', 'B', 'C', 'D', 'F').
 *    - Use a switch statement to print the description:
 *      'A' -> "Excellent"
 *      'B' -> "Good"
 *      'C' -> "Average"
 *      'D' -> "Below Average"
 *      'F' -> "Fail"
 *      default -> "Invalid grade"
 *
 * 3. Create an int variable trafficLight (1, 2, 3).
 *    - Use a switch to print:
 *      1 -> "Red"
 *      2 -> "Yellow"
 *      3 -> "Green"
 *      default -> "Invalid light"
 *
 * 4. Create an int variable menuOption (1-5).
 *    - Use switch to print which action was chosen (e.g., "Option 1 selected").
 *
 * Bonus:
 * 5. Combine multiple cases to handle weekends:
 *    - day = 6 or 7 -> print "Weekend"
 *    - day = 1-5 -> print "Weekday"
 * -------------------------------------------------------------
 */

public class Switch
{
    public static void main(String[] args)
    {
        int day = 3;
        String dayName;

        switch (day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

        // -------------------- Student Exercises --------------------
        // 1. Create int month (1-12) and print month name using switch.

        int month = 5;
        String monthName;

        switch (month)
        {
            case 1 :
                monthName = "January";
                break;
            case 2 :
                monthName = "February";
                break;
            case 3 :
                monthName = "March";
                break;
            case 4 :
                monthName = "April";
                break;
            case 5 :
                monthName = "May";
                break;
            case 6 :
                monthName = "June";
                break;
            case 7 :
                monthName = "July";
                break;
            case 8 :
                monthName = "August";
                break;
            case 9 :
                monthName = "September";
                break;
            case 10 :
                monthName = "October";
                break;
            case 11 :
                monthName = "November";
                break;
            case 12 :
                monthName = "December";
                break;
            default:
                monthName = "invalid name";
                break;

        }

        System.out.println("The month is "+ monthName);


        // 2. Create char grade and print description using switch.

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }



        // 3. Create int trafficLight (1-3) and print light color using switch.

        int trafficlight = 2;
        switch (trafficlight) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid traffic light value (must be 1-3).");
        }
        // 4. Create int menuOption (1-5) and print which option is selected.
        int menuOption = 2;
        switch (menuOption)

        {
            case 1:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("Settings");
                break;
            case 3:
                System.out.println("Help");
                break;
            case 4:
                System.out.println("About");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid menuOption value (must be 1-5).");
        }


        // 5. Combine cases for weekends (6 and 7) vs weekdays (1-5).

        int myDay = 6;

        switch (myDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day (must be 1–7).");
        }




    }
}
