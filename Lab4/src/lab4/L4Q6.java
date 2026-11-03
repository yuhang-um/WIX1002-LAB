/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author cherrykoay
 */
import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        
        // Keep generating until the number is non-negative (>= 0)
        do {
            num = random.nextInt();
        } while (num < 0);
        
        System.out.println("Generated number: " + num);
        
        int count = 0;
        int temp = num;
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }
        
        System.out.println("There are " + count + " digits in " + num);
    }
}