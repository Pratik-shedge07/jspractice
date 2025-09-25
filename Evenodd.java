import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number you entered is positive number");

        } else if (num < 0) {
            System.out.println("The number you entered is negative number  : ");

        } else {
            System.out.println("its the zero");
        }
        if (num % 2 == 0) {
            System.out.println("The number "+ num+ " is even number");
        } else {
            System.out.println("The number " +num+ " is odd number");
        }

    }

}

// 3. Number Classification (Scanner + Conditional + Operators)

// Ask user for a number.

// Check and print whether it is:

// Positive, Negative, or Zero

// Even or Odd

// 4. Increment/Decrement Practice

// Take a number from user.

// Print:

// Number after pre-increment

// Number after post-increment

// Number after pre-decrement

// Number after post-decrement

// 5. Simple Calculator (Scanner + Switch + Operators)

// Ask user for 2 numbers and an operator (+, -, *, /, %).

// Use switch to perform the calculation and print the result.

// 6. Random Number Game (Math Class + Scanner + Conditional)

// Generate a random number between 1–100 using Math.random().

// Ask user to guess the number.

// If user’s number = random → print “Correct”, else “Try Again”.

// 7. Count From X to Y (Scanner + Loops)

// Ask user for start and end numbers.

// Print all numbers from start to end using a while loop.

// 8. Largest of 3 Numbers (Scanner + Conditional)

// Ask user for 3 numbers.

// Use if-else to print the largest number.

// 9. Pattern Printing (Loops + Scanner)

// Ask user for a number N.

// Print a number pattern: