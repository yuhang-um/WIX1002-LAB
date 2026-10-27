/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.session.week2.pkg2;

/**
 *
 * @author cherrykoay
 */
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp in Fahrenheit:");
        double fah = sc.nextDouble();
        double cel = (fah-32)/1.8;
        
        System.out.printf("Temperature in Celsius: %.2f%n", cel);
        
        sc.close();
    }
    
}
