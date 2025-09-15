import java.util.Arrays;

/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */

public class DataTypesE
{
    public static void main(String[] args)
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();

        // -------------------- Student Exercises --------------------
        // 1. Create an int variable called age and assign it your age

        int myAge = 31;

        // 2. Create a double variable called temperature and assign it any decimal

        double temperature = 19.3;

        // 3. Create a char variable called gradeLetter and assign it a letter

        char gradeLetter = 'Z';

        // 4. Create a boolean variable called isJavaFun and assign true or false

        boolean isJavaFun = true;

        // 5. String variable
        String favoriteColor = "Red";

        // 6. int array

        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        System.out.println(Arrays.toString(numbers));

        // 7. Change one value

        numbers[2] = 100;
        System.out.println(Arrays.toString(numbers));

        // 8. String array with 3 favorite foods

        String[] StrArray = {"tajine", "pizza", "kebab"};
        for (String food : StrArray) {
            System.out.println(food);
        }

        // 9. Double addition

        double a = 10.78;
        double b = 12.1;
        double result = a + b;
        System.out.println("a + b = " + result);

        // 10. String concatenation

        String myName = "Yasyn";
        System.out.println("My name is " + myName + " and I am " + myAge + " years old.");
    }
}
