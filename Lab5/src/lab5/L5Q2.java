/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author cherrykoay
 */
import java.util.*;
public class L5Q2 {
    public static void main (String [] args) {
        Random random = new Random();
        int [] numbers = new int[10];
        int temp;
        boolean status;
        for (int i=0; i<numbers.length; i++) {
            status = true; // assume all integers are not duplicated first 
            temp = random.nextInt(21);
            for (int j=0; j<i; j++) {  // check current number and previous number
                if (temp==numbers[j]){
                    status = false;
                    break;
                }
            }
            if (status) {
                numbers[i] = temp;
            } else {
                i--; // back first, then go forward again to generate a new number, cuz outer loop got i++
            }
        }
        System.out.println("10 non-duplicate random integers within range(0-20): ");
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
