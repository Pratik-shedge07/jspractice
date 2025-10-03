import java.util.*;

// import java.util.*;

// public class Calculator {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number : ");
//         double num1 = sc.nextDouble();

//         System.out.println("Enter the second number : ");
//         double num2 = sc.nextDouble();

//         System.out.println("Enter the operation : ");
//         char operator = sc.next().charAt(0);
//         double result;

//         switch (operator) {
//             case '+':
//                 System.out.println("Sum of this number is " + (num1 + num2));
//                 break;
//                 case '-':
//                 System.out.println("subtraction of the two numbers is " + (num1 - num2));
//                 break;
//                 case'*':
//                 System.out.println("multiplication of this two numbers is "+(num1*num2));
//                 break;
//                 case '/':
//                 System.out.println("division of this two numbers is "+(num1 /num2));

//             default:
//                 break;
//         }

//     }
// }

// public class randomnumber {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int random = (int) (Math.random() * 10);
//         System.out.println("Guess the number from 0-10 : ");
//         int num = sc.nextInt();

//         System.out.println("The luck number is : " + random);
//         if (num == Math.random()) {
//             System.out.println(" you are correct ");

//         } else {
//             System.out.println("Better luck next time");
//         }
//     }
// }

// public class grade {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the marks of maths : ");
//         int sub1 =sc.nextInt();

//         System.out.println("Enter the marks of english : ");
//         int sub2 = sc.nextInt();

//         System.out.println("Enter the marks of Social Science Studies : ");
//         int sub3 = sc.nextInt();

//         System.out.println("Enter the marks of marathi : ");
//         int sub4 = sc.nextInt();

//         System.out.println("Enter the marks of Hindi : ");
//         int sub5 = sc.nextInt();

//         int total =sub1+sub2+sub3+sub4+sub5;

//         System.out.println("The total marks obtained by the student = "+total);

//         int percentage = (total*100)/500;

//         System.out.println( "The percentage obtained by the student is : "+ percentage+"%");

//         if(percentage<=100 && percentage>=80){
//             System.out.println("grade A");

//         }
//         else if( percentage<=80 && percentage>=60){
//             System.out.println("Grade B");

//         }
//         else if(percentage<=60 && percentage>=40){
//             System.out.println("Grade C");
//         }
//         else if (percentage<=40 && percentage>=35){
//             System.out.println("Grade D");
//         }
//         else{
//             System.out.println("fail !!!");
//         }
//     }
// }
public class AtmSimulator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;

        int balance = 1000;
        System.out.println("Enter you security pin = ");
        int userpin = sc.nextInt();

        if (pin == userpin) {
            System.out.println("Correct pin");

            System.out.println("Press 1 to check the balance");
            System.out.println("Press 2 to withdraw the money");
            System.out.println("Press 3 to deposit the money");
            System.out.println("Press 4 to exit");
        } else {
            System.out.println("Worng pin");
        }

        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Current balance =" + balance);
                break;
            case 2:
                System.out.println("Enter the amount of the with drawl : ");
                int withdraw = sc.nextInt();
                if (withdraw > balance) {
                    System.out.println("insufficent bank balance");
                } else {
                    System.out.println("money has been withdrawn succesfully");
                }
                System.out.println("your current balance = " + (balance - withdraw));

                break;

            case 3:
                System.out.println("Enter the amount to be deposited : ");
                int deposit = sc.nextInt();

                System.out.println("you amount has been deposited");
                System.out.println("your current balance = " + (deposit + balance));
                break;

            case 4:
                System.out.println("Thanks for the transaction ");
                break;

            default:
                System.out.println("Invalid choice ");
        }

    }
}