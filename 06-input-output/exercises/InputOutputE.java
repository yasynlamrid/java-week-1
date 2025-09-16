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

        Scanner scanner2 = new Scanner(System.in);
//        // Output examples
//        System.out.print("This is printed without a newline. ");
//        System.out.println("This is printed with a newline.");
//        System.out.printf("Formatted number: %.2f%n", 123.456);
//
//        // Input examples
//        Scanner scanner = new Scanner(System.in);
//
//        // 1. Reading a full line
//        System.out.print("Enter a line of text: ");
//        String line = scanner.nextLine();
//        System.out.println("You entered: " + line);
//
//        // 2. Reading an integer
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        System.out.println("You entered: " + number);
//
//        // 3. Reading a double
//        System.out.print("Enter a double: ");
//        double decimal = scanner.nextDouble();
//        System.out.println("You entered: " + decimal);
//
//        // 4. Reading a single word
//        System.out.print("Enter a single word: ");
//        String word = scanner.next();
//        System.out.println("You entered: " + word);
//
//        scanner.close();


        // ---------------------------------------------------------🚀 Student Exercises:---------------------------------
        //  * 1. Ask the user for their first name and last name separately,
        //  *    then print: "Hello, FirstName LastName!"
        String firstName;
        String lastName;

        System.out.print("Enter your First name : ");
        firstName = scanner2.nextLine();
        System.out.print("Enter your Last name : ");
        lastName = scanner2.nextLine();
        System.out.printf("Hello, %s %s %n" ,firstName,lastName );

        // * 2. Ask the user to enter two integers and print their sum, difference,
        // *    product, and quotient using System.out.printf for formatting.
        int a , b;
        System.out.print("Enter the first number : ");
        a = scanner2.nextInt();
        System.out.print("Enter the second number it should be different to 0  : ");
        b = scanner2.nextInt();
        System.out.printf("Sum : %d%nDifference : %d%nProduct : %d%n", a+b,a-b, a*b);
        if (b!=0){

            System.out.printf("Quotient : %.2f%n ", (double) a/b );

        }
        else {
            System.out.println("Error: Division by zero is not allowed!");

        }


         // * 3. Ask the user for the radius of a circle (double) and calculate
         // * the area (πr²) and circumference (2πr).

        double radius;
        System.out.print("Give me the radius of a circle : ");
        radius = scanner2.nextDouble();
        double area =  Math.PI * radius*radius;
        double circumference = 2* Math.PI * radius;
        System.out.printf("The area is: %.2f and the circumference is: %.2f%n", area, circumference);


        //* 4. Ask the user to enter their age, then print whether they are
        // * a child (<13), teenager (13–19), or adult (20+).

        int age;
        System.out.print("Enter your age : ");
        age = scanner2.nextInt();
        if (age >= 20){

            System.out.println("Your are adult ");

        } else if (age >=13) {
            System.out.println("Your are teenager ");

        } else {
            System.out.println("Your are child ");
        }



        //* 5. Create a simple "login" simulation:
        // *    - Ask the user for a username and password.
        // *    - If username = "admin" and password = "1234",
        // *      print "Access granted".
        // *    - Otherwise, print "Access denied".

        String username;
        String password;
        System.out.print("Enter your username : ");
        username = scanner2.nextLine();
        System.out.print("Enter your password : ");
        password = scanner2.nextLine();
        if(password.equals("1234") && username.equals("admin")){
            System.out.println("Access granted");
        }
        else {
            System.out.println("Access denied");
        }



    }







}
