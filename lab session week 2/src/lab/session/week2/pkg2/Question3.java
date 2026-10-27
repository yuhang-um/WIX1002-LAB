/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week2.pkg2;

/**
 *
 * @author cherrykoay
 */
import java.util.Random;
public class Question3 {
    public static void main (String[]args){
        Random random = new Random();
        
        int num1 = random.nextInt(10,51);
        int num2 = random.nextInt(10,51);
        int num3 = random.nextInt(10,51);
        
        int sum = num1+num2+num3;
        double average=sum/3.0;
        
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        
    }
    
}
