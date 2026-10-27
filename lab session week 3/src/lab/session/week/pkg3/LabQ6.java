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
public class LabQ6 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter radius of a circle: ");
        double radius = input.nextDouble();
        
        System.out.println("Enter x-coordinate: ");
        double x = input.nextInt();
        
        System.out.println("Enter y-coordinate: ");
        double y = input.nextInt();
        
        if (radius<0){
            System.out.println("radius cannot be zero");
        }else{
            double distancesquared = x * x + y * y;
            double radiussquared = radius * radius;
            
            if (distancesquared < radiussquared){
                System.out.println("The point is inside the circle");
            } else if (distancesquared == radiussquared){
                System.out.println("The point on inside the circle");
            } else{
                System.out.println("The point is outside the circle");
            }
        }
        input.close();
        
    }
}
