/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // -------------------- Student Exercises --------------------
        // 1. Create two int variables x and y, then perform all arithmetic operations.
        int x = 12;
        int y = 2;

        int sum2 = x + y;
        int diff = x - y;
        int prod = x * y;
        int quot = x / y;
        int rem = x % y;

        System.out.println("x + y = " + sum2);
        System.out.println("x - y = " + diff);
        System.out.println("x * y = " + prod);
        System.out.println("x / y = " + quot);
        System.out.println("x % y = " + rem);

        // 2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).
        int num1 = 3;
        int num2 = 7;
        int intDiv = num2 / num1;
        System.out.println("7 / 3 with int = " + intDiv); // output: 2

        // 3. Use double variables for division and compare with int division.
        double num1d = 3;
        double num2d = 7;
        double doubleDiv = num2d / num1d;
        System.out.println("with int: " + intDiv + " -------- with double: " + doubleDiv); // 2 vs 2.3333

        // 4. Create three int variables, add them, and print the total.
        int i = 3, j = 4, k = 7;
        int total = i + j + k;
        System.out.println("Sum of i, j, k = " + total);

        // 5. Calculate the square of a number (e.g., 6 * 6).
        int z = 7;
        int square = z * z;
        System.out.println("Square of z = " + square);

        // 6. Calculate the average of three numbers.
        double average = (i + j + k) / 3.0; // division en double pour précision
        System.out.println("Average = " + average);

        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        System.out.println("Double division by 0: " + (7.65 / 0)); // output: Infinity
        // System.out.println("Int division by 0: " + (7 / 0)); // => cela lancerait ArithmeticException
    }
}
