import java.util.*;

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number : ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operation : ");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                System.out.println("Sum of this number is " + (num1 + num2));
                break;
                case '-':
                System.out.println("subtraction of the two numbers is " + (num1 - num2));
                break;
                case'*':
                System.out.println("multiplication of this two numbers is "+(num1*num2));
                break;
                case '/':
                System.out.println("division of this two numbers is "+(num1 /num2));

            default:
                break;
        }

    }
}

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