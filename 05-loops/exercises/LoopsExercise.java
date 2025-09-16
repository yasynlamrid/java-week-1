import java.util.Scanner;

/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

public class LoopsExercise
{
    public static void main(String[] args)
    {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).

        for (int i =10 ; i >= 1 ; i--){

            System.out.println(i);

        }

        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).

        for (int i = 1 ; i <= 10 ; i++)
        {

            System.out.println("7 x " + i + " = " +i*7 );

        }

        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
        int i=1;
        int sum = 0;
        while (i <=100)
        {
            sum +=i;
            i++;

        }

        System.out.println("sum from 1 to 100: " + sum);


        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.


        int sum2 = 0;
        int j=1;
        while(j<=20 )
        {
            if (j % 2 !=0 ){
                sum2+=j;


            }

            j++;


        }
        System.out.println("Sum of odd numbers from 1 to 20: " + sum2);

        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please enter a negative number : ");
            number = scanner.nextInt();

            if(number >= 0 ){

                System.out.println("You need to put a negative number ");

            }
        }while ( number >= 0);
        System.out.println("you antreded a corect number, thanks ");
        scanner.close();


        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        for (String color : colors){
            System.out.println(color.toUpperCase());
        }

        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.

        int [] numbers = {2, 4, 6, 8, 10};
        int s=0;

        for ( int num : numbers ){

            s+=num;
        }
        System.out.println("The same of 2, 4, 6, 8, 10 is " + s);



        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
        for (int k = 1; k <= 3 ; k++){

            for (int l=1 ; l <= 3 ; l++){

                System.out.println(k +" x " + l +" = " + k*l);

            }
        }


        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****




        for (int n = 1; n <= 4; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print("*");
            }
            System.out.println();
        }



        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.

        for (int v = 1; v <= 20; v++) {
            if (v > 15) {
                break;
            }
            if (v % 3 == 0) {
                continue;
            }
            System.out.println(v);
        }


        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
        int w = 1;
        while(  w<=10 ){
            System.out.println(w);
            if( w % 7 == 0 ){
                break;
            }

            w++;
        }

    }
}
