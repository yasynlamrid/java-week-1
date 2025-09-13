/**
 * Exercises: Input and Output in Java
 * -----------------------------------------------------
 * This program demonstrates:
 * 1. Output
 *   - System.out.print(): Prints text without a newline.
 *   - System.out.println(): Prints text with a newline.
 *   - System.out.printf(): Prints formatted text.
 *
 * 2. Input (using Scanner)
 *   - nextLine(): Reads a line of text.
 *   - nextInt(): Reads an integer.
 *   - nextDouble(): Reads a double.
 *   - next(): Reads a single word.
 *
 * -----------------------------------------------------
 * 🚀 Student Exercises:
 * 1. Ask the user for their first name and last name separately,
 *    then print: "Hello, FirstName LastName!"
 *
 * 2. Ask the user to enter two integers and print their sum, difference,
 *    product, and quotient using System.out.printf for formatting.
 *
 * 3. Ask the user for the radius of a circle (double) and calculate
 *    the area (πr²) and circumference (2πr).
 *
 * 4. Ask the user to enter their age, then print whether they are
 *    a child (<13), teenager (13–19), or adult (20+).
 *
 * 5. Create a simple "login" simulation:
 *    - Ask the user for a username and password.
 *    - If username = "admin" and password = "1234",
 *      print "Access granted".
 *    - Otherwise, print "Access denied".
 *
 * -----------------------------------------------------
 */

import java.util.Scanner;

public class InputOutputE
{
    public static void main(String[] args)
    {
        // Output examples
        System.out.print("This is printed without a newline. ");
        System.out.println("This is printed with a newline.");
        System.out.printf("Formatted number: %.2f%n", 123.456);

        // Input examples
        Scanner scanner = new Scanner(System.in);

        // 1. Reading a full line
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);

        // 2. Reading an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // 3. Reading a double
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // 4. Reading a single word
        System.out.print("Enter a single word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        scanner.close();
    }
}
