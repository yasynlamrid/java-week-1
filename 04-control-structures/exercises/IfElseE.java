/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable x and check if it is even or odd using if-else.
 *
 * 2. Create an int variable age.
 *    - If age >= 18, print "Adult".
 *    - Else, print "Minor".
 *
 * 3. Create an int variable score (0-100).
 *    - Use if-else to assign grades:
 *      >=90 -> "A"
 *      >=75 -> "B"
 *      >=50 -> "C"
 *      <50  -> "F"
 *
 * 4. Create a double variable temperature.
 *    - If temperature > 30, print "Hot".
 *    - Else if temperature >= 20, print "Warm".
 *    - Else, print "Cold".
 *
 * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
 * -------------------------------------------------------------
 */

public class IfElseE
{
    public static void main(String[] args)
    {
        int number = 10;

        if (number > 0)
        {
            System.out.println("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }

        // -------------------- Student Exercises --------------------
        // 1. Check if x is even or odd.

        int x = 5;
        if(x % 2 ==0) {

            System.out.println("The number is even");
        }
        else {

            System.out.println("The number is odd");

        }

        // 2. Check age and print "Adult" or "Minor".

        int age = 23;
        if(age >= 18 ){

            System.out.println("You are adult");

        }

        else {

            System.out.println("You are Minor");

        }

        // 3. Assign grades based on score using if-else if-else.

        int score = 85;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);


        // 4. Check temperature and print "Hot", "Warm", or "Cold".

        int temperature = 12;
                if (temperature >= 30) {

                    System.out.println("Hot");

                } else if (temperature >= 15) {

                    System.out.println("Warm");

                }else {

                    System.out.println("Cold");
                }


        // 5. Check if n is positive AND even using logical operators.

        int n = 15;

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("The number " + n + " is positive and even");
            } else {
                System.out.println("The number " + n + " is positive and odd");
            }
        } else if (n < 0) {
            if (n % 2 == 0) {
                System.out.println("The number " + n + " is negative and even");
            } else {
                System.out.println("The number " + n + " is negative and odd");
            }
        } else {
            System.out.println("The number is zero");
        }

    }
}

