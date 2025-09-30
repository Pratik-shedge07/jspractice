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