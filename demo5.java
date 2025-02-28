// Write a program to take two numbers and an operator as input and perform the operation on the numbers. The operator can be +, -, *, /, %.    
// Use switch case to perform the operation.

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("Enter an operator: ");
        char operator = sc.next().charAt(0);        
        switch(operator) {
            case '+':
                System.out.println("a+b="+(a+b));
                break;
            case '-':
                System.out.println("a-b="+(a-b));
                break;
            case '*':
                System.out.println("a*b="+(a*b));
                break;
            case '/':
                System.out.println("a/b="+(a/b));
                break;
            case '%':
                System.out.println("a%b="+(a%b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close(); 

        
    }
    
}
