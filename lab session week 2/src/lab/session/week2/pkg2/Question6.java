/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week2.pkg2;

/**
 *
 * @author cherrykoay
 */
import java.util.Scanner;
public class Question6 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter amount of water in gram: ");
        double M = input.nextDouble();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initemp = input.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finaltemp = input.nextDouble();
        
        double initempCel = (initemp-32)/1.8;
        double finaltempCel = (finaltemp-32)/1.8;
        M=M/1000;
        double Q=M*(finaltempCel-initempCel)*4184;
        
        System.out.printf("The energy needed is %.6e%n", Q);
        input.close();
    }
}

