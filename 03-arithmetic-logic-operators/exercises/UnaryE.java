/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable num = 8.
 *    - Apply unary minus and print the result.
 *    - Apply unary plus and print the result.
 *
 * 2. Create a boolean variable isOpen = false.
 *    - Use logical NOT (!) to invert its value and print it.
 *
 * 3. Create an int variable counter = 0.
 *    - Use pre-increment (++counter) and print the value.
 *    - Use post-increment (counter++) and print the value.
 *
 * 4. Create an int variable count = 5.
 *    - Use pre-decrement (--count) and print the value.
 *    - Use post-decrement (count--) and print the value.
 *
 * Bonus:
 * 5. Combine unary operators with arithmetic:
 *    Example: int x = 10; int y = -x + ++x; print y and explain.
 * -------------------------------------------------------------
 */

public class UnaryE
{
    public static void main(String[] args) {
        int a = 5;
        int b = -a; // Unary minus
        int c = +a; // Unary plus
        boolean flag = true;
        boolean notFlag = !flag; // Logical NOT
        int x = 10;
        x++; // Increment
        int y = 10;
        y--; // Decrement

        System.out.println("Original a: " + a);
        System.out.println("Unary minus b: " + b);
        System.out.println("Unary plus c: " + c);
        System.out.println("Original flag: " + flag);
        System.out.println("Logical NOT notFlag: " + notFlag);
        System.out.println("Incremented x: " + x);
        System.out.println("Decremented y: " + y);


        // -------------------- Student Exercises --------------------
        // 1. Create int num = 8; apply unary minus and plus.

        int num = 8;
        int negativeNum = -num; // Unary minus
        int positiveNum = +num; // Unary plus

        System.out.println("Original num: " + num);
        System.out.println("Unary minus negativeNum: " + negativeNum);
        System.out.println("Unary plus positiveNum: " + positiveNum);

        // 2. Create boolean isOpen = false; invert it with !.
        boolean isOpen = false;
        boolean NotisOpen = !isOpen;
        System.out.println(NotisOpen);

        // 3. Create int counter = 0; use pre-increment and post-increment.

        int counter = 0;
        int preIncrement = ++counter;
        int postIncrement = counter++;

        System.out.println("After pre-increment: " + preIncrement);   // 1
        System.out.println("After post-increment: " + postIncrement); // 1
        System.out.println("Counter now: " + counter);                // 2

        // 4. Create int count = 5; use pre-

        int count = 5;
        int preDecrement = --count;
        int postDecrement = count--;

        System.out.println("After pre-decrement: " + preDecrement);   // 4
        System.out.println("After post-decrement: " + postDecrement); // 4
        System.out.println("Count now: " + count); // 3

    }
}