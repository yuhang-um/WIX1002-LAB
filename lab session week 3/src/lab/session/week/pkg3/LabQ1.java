/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week.pkg3;

/**
 *
 * @author cherrykoay
 */
import java.util.*;

public class LabQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
                
            case '-':
                System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
                
            case '*':
                System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
                
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
                } else {
                    System.out.println("Division by zero is math error.");
                }
                break;
                
            case '%':
                if (num2 != 0) {
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Division by zero is math error.");
                }
                break;
                
            default:
                System.out.println("Invalid operator");
                break;
        }

        input.close();
    }
}

