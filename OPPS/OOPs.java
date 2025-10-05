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
class Mobile {
    String brand;
    int price;
    void display(){
        System.out.println("this is brand "+brand);
        System.out.println("this is the price "+price);
    } 
}
public class OOPs {
    public static void main(String[] args) {
        Mobile m1= new Mobile();
        Mobile m2= new Mobile();
        m1.brand="Smasung";
        m1.price=50000;
        m2.brand="apple";
        m2.price=500000;
        m1.display();
        m2.display();

    }
}