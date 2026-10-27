/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week2.pkg2;

/**
 *
 * @author cherrykoay
 */
import java.util.*;
public class Question2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter car price: ");
        double P = input.nextDouble();
        
        System.out.print("Enter down payment: ");
        double D = input.nextDouble();
        
        System.out.print("Enter interest rate (%): ");
        double R = input.nextDouble();
        
        System.out.print("Enter loan duration (years): ");
        int Y = input.nextInt();
        
        if (P<0 || D<0 || D>P || R<0 || Y<=0) {
            System.out.println("Invalid input");
        }else{
            double M = (P-D)*(1+R*Y/100)/(Y*12);
            
            System.out.printf("Monthly payment: RM%.2f%n", M);
        }
        input.close();
    }
}
