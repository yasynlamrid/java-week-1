/**
 * This is a placeholder class for input/output examples.
 * -----------------------------------------------------
 * 1- Output:
 *   - System.out.print(): Prints text without a newline.
 *   - System.out.println(): Prints text with a newline.
 *   - System.out.printf(): Prints formatted text.
 *
 *   2- Input:
 *   - Scanner class: Used to read input from various sources (e.g., keyboard).
 *   - nextLine(): Reads a line of text.
 *   - nextInt(): Reads an integer.
 *   - nextDouble(): Reads a double.
 *   - next(): Reads a single word.
 * -----------------------------------------------------
 */

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
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
