package lab.session.week2.pkg2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cherrykoay
 */

//Matric Number: 26005487
import java.util.Scanner;
public class TASK {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("Enter some text: ");
        String text=input.nextLine();

        System.out.println();
        System.out.println("10 different types of formatiing: ");
        System.out.println();
        System.out.printf("1. Normal number: %d%n", num);
        System.out.printf("2. Number right-aligned: |%10d|%n", num);
        System.out.printf("3. Number left-aligned: |%-10d|%n", num);
        System.out.printf("4. Number with fixed point: %.2f%n", (double)num);
        System.out.printf("5. Number leading zeros: %05d%n", num);
        System.out.printf("6. Normal text: %s%n", text);
        System.out.printf("7. First five characters: %.5s%n", text);
        System.out.printf("8. The character at index 0: %c%n", text.charAt(0));
        System.out.printf("9. First five characters in a 10 width padding: %10.5s%n", text);
        System.out.printf("10. Text right-aligned: *%15s*%n", text);
        
        
    }
}