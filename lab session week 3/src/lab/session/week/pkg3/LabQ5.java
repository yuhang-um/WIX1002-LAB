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
public class LabQ5 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        
        System.out.print("Enter f: ");
        double f = input.nextDouble();
        
        double deno = a * d - b * c; 
        
        if (deno==0){
            System.out.println("The equation has no solution");
        } else{
            double x = (e*d - b*f)/deno;
            
            double y = (a*f - e*c)/deno;
            
            System.out.printf("X = %.2f%n", x);
            System.out.printf("Y = %.2f%n", y);
        }
        input.close();
    }
}
