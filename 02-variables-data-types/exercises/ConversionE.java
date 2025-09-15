/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------

        System.out.println("\n================ Student Exercises =======================");
        System.out.println("=== Implicit (Widening) Conversions ===");
        // 1. Create a short variable with any value and assign it to an int (implicit)

        short myShort = 17;
        int intFromShort = myShort;
        System.out.println("short (" + myShort + ") → int "+intFromShort);

        // 2. Create an int variable with a large value and assign it to a long (implicit)

        int myLargeInt = 1215444522;
        long longFromInt = myLargeInt;
        System.out.println("int (" + myLargeInt + ") → long "+longFromInt);

        // 3. Create a long variable and assign it to a float (implicit)

        long myLong = 45343241344132L;
        float floatFromLong = myLong;
        System.out.println("long (" + myLong + ") → float "+floatFromLong);

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");

        // 4. Create a double variable and cast it to a float (explicit)

        double myDouble = 45.5454;
        float floatFromDouble =(float) myDouble;
        System.out.println("double (" + myDouble + ") → float "+floatFromDouble);

        // 5. Create an int variable and cast it to a short (explicit)

        int myInt = 423;
        short shotFromInt =(short) myInt;
        System.out.println("int (" + myInt + ") → short "+shotFromInt);

        // 6. Create a long variable and cast it to a byte (explicit)

        long myLong2 = 4789L;
        byte byteFromLong =(byte) myLong2;
        System.out.println("long (" + myLong2 + ") → byte "+byteFromLong);

        // 7. Try converting a large int (e.g., 1000) to a byte and print the result

        int myInt2 = 42301;
        byte byteFromInt =(byte) myInt;
        System.out.println("int (" + myInt2 + ") → byte "+byteFromInt);

        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value

        char mychar = 'A';
        int IntFromChar = mychar;
        System.out.println("char (" + mychar + ") → int "+IntFromChar);

        // 9. Convert an int into a char and print the resulting character

        int myInt3 = 9;
        char  charFromInt =(char) myInt3;
        System.out.println("int (" + myInt3 + ") → char "+charFromInt);


        // 10. Create a double with decimals, convert it to int, and print the result

        double myDouble2 = 45.5454;
        int intFromDouble =(int) myDouble2;
        System.out.println("double (" + myDouble2 + ") → int "+intFromDouble);
    }
}
