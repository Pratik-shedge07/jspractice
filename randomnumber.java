import java.util.*;

public class randomnumber {
    public static void main(String args[]) {
        Scanner sc =  new Scanner (System.in);
        int random =(int)(Math.random()*10);
        System.out.println("Guess the number from 0-10 : ");
        int num = sc.nextInt();

        System.out.println( "The luck number is : "+ random );
        if( num == Math.random()){
            System.out.println(" you are correct ");

        }
        else{
            System.out.println("Better luck next time");
        }



  
    }
}



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