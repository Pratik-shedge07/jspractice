 import java.lang.classfile.instruction.SwitchCase;
import java.util.*;

//******************************************************array 2d************************************* */
// public class Main {
//     public static void main(String[] args) {
//         int [][] finalmarks = {{22, 98,65},{55,33,87}};
//          System.out.println( finalmarks[1][0]);
//     }
// }
//*********************************************Casting******************************************** */
//  public class Main {
//     public static void main(String[] args) {
//       int p=10;
//       double q =20.1;
//       p=(int)q;
//       System.out.println(p);
//     }
//  }
//**************************************************Operation Operators***************************** */
// public class Main {
//    public static void main (String args[]){
//        int a =153;
//        int b =20;
//        int c ;
//        System.out.println("sum :"+(a+b));
//        System.out.println ("subtraction :" +(a-b));
//        System.out.println("Multiplication :" +(a*b));
//        System.out.println("Division :" +(a/b)); 
//       System.out.println("Modolus :" +(a%b));
//    }
// }
//*******************************************************increment and decrement***************************** */
// public class Main {
//    public static void main (String args []){
//       int a= 10;
//       int b= 20;
//       System.out.println(++a);   // pre increment
//       System.out.println(a++);   // post increment
//       System.out.println(a);
//       System.out.println(--b);   // pre decrement
//       System.out.println(b--);   // post decrement 
//       System.out.println(b);
//    }
// }
//*******************************************************maths Class***************************** */
// public class Main{
//    public static void main(String args[]){
//       System.out.println ( "maximum value : "+Math.max(10,20)); //find the maximum number
//       System.out.println ("minumum value : "+Math.min(10,20)); //find the minimum number
//       System.out.println( "random value : "+Math.random()); // gives the random number between 0.0-1.0
//       System.out.println( "random value multiplied by 100 : "+Math.random()*100); // gives the random number between 0.0-100.0 because we multiply it by 100
//       System.out.println( "Random value multiplied by 100 and concated the in type : "+(int)Math.random()*100); // gives the random number between 0-100 because we type cast it to int
//    }
// }
//*******************************************************Scanner Function***************************** */
// public class  Main{
//    public static void main(String args[]){
      
//       Scanner sc=new Scanner (System.in);

//       // System.out.println("Enter your age : ");
//       // int age =sc.nextInt(); //take the int type of input function
//       // System.out.println("Your age is : "+age);

//       // System.out.println("Enter your Name  : ");
//       // String name = sc.next(); //take the single  string type of input function
//       // System.out.println("Your name is : "+name);

//       System.out.println("Enter your address : ");
//       String address =sc.nextLine(); //take the multiple string type of input function
//       System.out.println("Your address is : "+address);
//    }
// }
//***********************************************Conditional Statements***************************** */
// public class Main {
//     public static void main (String args[]){
//         int age =19;
//         int height = 7;

//         if( age>18 ){ // singe condition is used 
//             System.out.println("you can vote");
//         }
//         else{
//             System.out.println("you cannot vote");
//         }


//          if(age >18 && height>6){ //multi condition is used using "&&" operator
//             System.out.println("You are tall enough");
//          }
//          else{
//             System.out.println("You are short");
//          }

         
//          if( age > 18 || height>6){ //any of the condition is correct it will execute the if condition bcz we use OR "||" operator
//             System.out.println("youu can do any thing");
//          }
//          else{
//             System.out.println("You are not eligible");
//          }
//          boolean isadult = true;
//          if( isadult=true ){ // boolen expression is used
//             System.out.println(" its adult");
//          }
//          else{
//             System.out.println("its not adult");
//          }
//     }
// }
//  public class Main {
//     public static void main(String[] args) {
//         int nbprice = 70;
//         int penprice= 80;
//         int cusbalance ;
//         Scanner sc =new Scanner(System.in);
//         System.out.println("what is the balance you have : ");
//         cusbalance =sc.nextInt();

//         if(cusbalance>=nbprice+penprice){
//          System.out.println("yes you can buy both");    
//         }

//         else if (cusbalance >= nbprice) {
//             System.out.println("you can buy notebook");
//         }

//         else if(cusbalance>= penprice){
//             System.out.println("yes you can buy pen");
//         }

//         else{
//             System.out.println("you cannot buy");
//         }
//     }
//  }
//*********************************************switch condition************************* */
public class Main{
    public static void main(String[] args) {

        int day;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your day : ");
        day =sc.nextInt();
        switch (day){
            case 1 :
            System.out.println(" monday");
            break; // break the flow of the statement or the program

            case 2:
            System.out.println("Tuesday");
            break;

            case 3 :
            System.out.println("wednesday");
            break;

            case 4 :
            System.out.println("thursady");
            break;

            default:
            System.out.println(" friday- sunday");
        }
    }
}