// package OPPS;
// class pen{ ///// classs
//     String colour;
//     String type;
//     public void write(){
//         System.out.println("writing");
//     }
// }
// public class OOPs { //// Main class
//     public static void main(String[] args) {
//         pen pen1 =new pen(); /// created the object of the pen class
//         pen1.colour="blue"; //assingning the value by objeect to the datatype
//         pen1.type="ball";
//         pen1.write(); // calling the method by the class object
//     }
// }
// **************************************exapmle***************************
// class Mobile {
//     String brand;
//     int price;
//     void display(){
//         System.out.println("this is brand "+brand);
//         System.out.println("this is the price "+price);
//     } 
// }
// public class OOPs {
//     public static void main(String[] args) {
//         Mobile m1= new Mobile();
//         Mobile m2= new Mobile();
//         m1.brand="Smasung";
//         m1.price=50000;
//         m2.brand="apple";
//         m2.price=500000;
//         m1.display();
//         m2.display();

//     }
// }
// class Student{
//     String Name;
//     int roll_no;
//     int Marks;

//  void disply(){
//     System.out.println("Student Name = "+Name);
//     System.out.println("StudentRollno = "+roll_no);
//     System.out.println("Student marks = "+Marks);
// }
// }
// public class Main{
//     public static void main(String args[]){

//         Student s1 =new Student();
//         s1.Name="Pratik";
//         s1.roll_no=21;
//         s1.Marks=98;

//         Student s2 =new Student();
//         s2.Name="prasad";
//         s2.roll_no=21;
//         s2.Marks=98;

//         Student s3 =new Student();
//         s3.Name="yeole";
//         s3.roll_no=21;
//         s3.Marks=98;

//         s1.disply();
//         s2.disply();
//         s3.disply();

//     }
// }

// Create a class BankAccount with fields: accountNumber, balance.
// Add a method deposit(int amount) which increases balance and prints new balance.
// Add a method withdraw(int amount) which decreases balance and prints new balance.
// In main(), create one account and test deposit & withdraw. *
// import java.util.*;

// class BankAcount{
//     Scanner sc =new Scanner(System.in);
//     int accountNumber;
//     int balance=5000;

//     void deposit(){
//         System.out.println("Enter the amount to deposite = ");
//         int amount=sc.nextInt();
//         int ubalance=amount+balance;
//         System.out.println("Your updated balance = "+ubalance);
//     }
//     void withDraw(){
//         System.out.println("Enter the withdraw amount = ");
//         int amount=sc.nextInt();
//         int ubalance=balance-amount;
//         System.out.println("you updated balance  = "+ubalance);
//     }
// }
// public class Main{
//     public static void main(String args[]){

//         BankAcount account= new BankAcount();
//         account.accountNumber=1002;
//         account.deposit();

//         BankAcount account2= new BankAcount();
//         account2.accountNumber=100005;
//         account2.withDraw();
//     }
// }

// Library – Class Book inside Library class; addBook(), showAllBooks()
// import java.util.*;

// class Library {
//      ArrayList<String> bookNames = new ArrayList<>();
//     ArrayList<String> authorNames = new ArrayList<>();

//     Scanner sc = new Scanner(System.in);

//     void addBook() {
//         int n;

//         System.out.println("Add the number of books you want to add : ");
//         n = sc.nextInt();
//          sc.nextLine();

//         if (n<=0) {
//             System.out.println("Invalid error");
//             return;
//          }

//         for(int i = 0; i<n;i++){

//         System.out.println("\nEnter the books to add : ");
//         String bookName = sc.nextLine();

//         System.out.println("Enter the name of author  : ");
//         String authorName = sc.nextLine();
//         bookNames.add(bookName);
//         authorNames.add(authorName);
//          }   
//     }

//    void display() {
//     System.out.println("\n Books in Library:");
//     for (int i = 0; i < bookNames.size(); i++) {
//         System.out.println((i + 1) + ". " + bookNames.get(i) + " by " + authorNames.get(i));
//     }
// }
// }
// public class Main {
//     public static void main(String args[]) {
//         Library library = new Library();
//         library.addBook();
//         library.display();
//     }
// }

// Goal: Create a program to store movies and their ratings.
// Create a class MovieCollection
// Fields: ArrayList<String> movieNames, ArrayList<Double> ratings
// Methods:
// addMovie() → take movie name and rating from user, add to lists
// showMovies() → display all movies with ratings
// import java.util.ArrayList;

import java.util.*;

// class MovieCollection {

//     ArrayList<String> movieNames = new ArrayList<>();
//     ArrayList<Double> ratings = new ArrayList<>();

//     Scanner sc = new Scanner(System.in);

//     void addModies() {

//         System.out.println("\nEnter the number of movies you want to enter : ");
//         int n = sc.nextInt();
//         sc.nextLine();

//         if (n < 0) {
//             System.out.println("Enter the valid number !!");
//             return;
//         }

//         for (int i = 0; i <n; i++) {

//             System.out.println("Enter the movie name : ");
//             String moviename = sc.nextLine();

//             System.out.println("Enter the IMDB rating out of 10 : ");
//             double rating = sc.nextDouble();
//             sc.nextLine();

//             movieNames.add(moviename);
//             ratings.add(rating);
//         }

//     }

//     void showMovies() {
//         for(int i =0 ;i<movieNames.size();i++)
//         {
//         System.out.println(movieNames.get(i) + " are the movies with the rating of " + ratings.get(i));
// }
//     }
// }

// public class Main {
//     public static void main(String args[]) {
//         MovieCollection mc =new MovieCollection();
//         mc.addModies();
//         mc.showMovies();

//     }
// }
// taking employee details (ID, name, salary) from the user,
// storing them in ArrayLists,
// and then displaying all employees.

// class Employee{

//     ArrayList<Integer> empIds = new ArrayList<>();
//     ArrayList<String> empNames = new ArrayList<>();
//     ArrayList<Integer> empsalarys = new ArrayList<>();

//     Scanner sc =new Scanner(System.in);

//     void empDetails(){
//         System.out.println("Enter the number of Employee details to add : ");
//         int n =sc.nextInt();
//         sc.nextLine();

//         if(n<0){
//             System.out.println("Invalid !! enter the valid number ");
//             return;
//         }
//         for (int i =0 ; i<n; i++){
//             System.out.println("Enter the employee id : ");
//             int empId = sc.nextInt();
//             sc.nextLine();
//             System.out.println("Enter the Employee name : ");
//             String empname = sc.nextLine();
//             System.out.println ("Enter the Employee Salary : ");
//             int empSalary = sc.nextInt();

//             empIds.add(empId);
//             empsalarys.add(empSalary);
//             empNames.add(empname);
//         }
//     }
//     void display(){
//         for(int i = 0 ; i<empIds.size(); i++){
//             System.out.println("ID = "+empIds.get(i)+" Name = "+empNames.get(i)+" Salary = "+empsalarys.get(i));
//         }
//     }

// }
// public class Main{
//     public static void main(String args[]){
//         Employee employee = new Employee();
//         employee.empDetails();
//         employee.display();

//     }
// }
