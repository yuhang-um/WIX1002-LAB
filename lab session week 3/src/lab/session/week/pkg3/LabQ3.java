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
public class LabQ3 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter sales volume: ");
        double sales = input.nextDouble();
        
        double rate;
        double commission;
        
        if (sales<0){
            System.out.println("Sales volume cannot negative.");
        }else{
            if (sales<=100){
                rate=0.05;
            } else if (sales<=500){
                rate=0.075;
            } else if (sales<=1000){
                rate=0.10;
            } else {
                rate=0.125;
            }
        commission = sales * rate;
        System.out.printf("The commission is RM %.2f%n", commission);
        }
        input.close();
    }
}
