/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create a new int variable b with the value 20.
 *    - Use += to add 10 to b and print the result.
 *    - Use -= to subtract 5 from b and print the result.
 *
 * 2. Create another int variable c with the value 15.
 *    - Multiply c by 3 using *= and print the result.
 *    - Divide c by 2 using /= and print the result.
 *
 * 3. Use %= with c to find the remainder when divided by 4.
 *
 * 4. Create a double variable d = 12.5.
 *    - Use += and *= to update d and print results.
 *
 * Bonus:
 * 5. Create a variable x = 7.
 *    - Use x += x to double its value.
 *    - Use x *= x to square its value.
 *
 * 6. Combine assignment operators in a sequence:
 *    Example: Start with y = 50, then apply -= 10, *= 2, /= 5, and %= 6.
 *    Print the value after each step.
 * -------------------------------------------------------------
 */

public class AssignmentE
{
    public static void main(String[] args)
    {
        int a = 10; // Assignment
        System.out.println("Initial value of a: " + a);

        a += 5; // Addition assignment
        System.out.println("After a += 5: " + a);

        a -= 3; // Subtraction assignment
        System.out.println("After a -= 3: " + a);

        a *= 2; // Multiplication assignment
        System.out.println("After a *= 2: " + a);

        a /= 4; // Division assignment
        System.out.println("After a /= 4: " + a);

        a %= 3; // Modulus assignment
        System.out.println("After a %= 3: " + a);


        System.out.println("----------------------------------------------------------");
        // -------------------- Student Exercises --------------------
        // 1. Create an int variable b = 20 and use +=, -= with it.
        int b = 20;
        b += 5;
        System.out.println(b); // output: 25
        b -= 1;
        System.out.println(b); // output: 24

        // 2. Create an int variable c = 15 and use *=, /= with it.
        int c = 15;
        c *= 2;
        System.out.println(c); // output: 30
        c /= 3;
        System.out.println(c); // output: 10

        // 3. Use %= with c to find remainder when divided by 4.
        c += 5; // 10 + 5 = 15
        c %= 4; // 15 % 4 = 3
        System.out.println(c); // output: 3

        // 4. Create a double variable d = 12.5, then use += and *=.
        double d = 12.5;
        d += 3; // 12.5 + 3 = 15.5
        System.out.println(d); // output: 15.5
        d *= 2; // 15.5 * 2 = 31.0
        System.out.println(d); // output: 31.0

        // 5. Create x = 7, double it with +=, then square it with *=.
        int x = 7;
        x += 7; // 7 + 7 = 14
        System.out.println(x); // output: 14
        x *= 7; // 14 * 7 = 98
        System.out.println(x); // output: 98

        // 6. Start y = 50, apply -= 10, *= 2, /= 5, %= 6 step by step.
        int y = 50;
        y -= 10; // 50 - 10 = 40
        y *= 2;  // 40 * 2 = 80
        y /= 5;  // 80 / 5 = 16
        y %= 6;  // 16 % 6 = 4
        System.out.println(y); // output: 4
    }
}
