import java.util.Scanner;
class Mystack{
int top;
int size;
int stack[];
public Mystack(int size){
    this.size=size;
    stack=new int[size];
    top=-1;
}
public void push(int data){
    if(top==size-1){
        System.out.println("Stack Overflow");
    }else{
        top++;
        stack[top]=data;
        System.out.println(data+" pushed to stack");
    }
}
public void display(){
    if(top==-1){
        System.out.println("Stack is empty");
    }else{
        System.out.println("Stack elements are:");
        
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    
}
public int pop(){
    if(top==-1){
        System.out.println("Stack Underflow");
        return -1;
    }else{
        int data=stack[top];
        top--;
        return data;
    }
}
public int peek(){
    if(top==-1){
        System.out.println("Stack is empty");
        return -1;
    }else{
        return stack[top];
    }
} 
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int size=sc.nextInt();
        Mystack ms=new Mystack(size);
ms.push(10);
ms.push(20);         
ms.push(30);
ms.push(40);
ms.push(50);
ms.push(60); 
ms.display();
ms.pop();
ms.display();
ms.peek();   

    }
}