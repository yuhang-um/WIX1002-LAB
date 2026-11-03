/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author cherrykoay
 */
import java.util.*;

public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generate a random integer n from 0 to 100
        int n = rand.nextInt(101); 
        
        System.out.println("Generated n = " + n);
        System.out.print("The first " + n + " prime numbers are: ");
        
        if (n == 0) {
            System.out.println("None, n is 0");
            return;
        }

        int count = 0;
        int currentNumber = 2; // Start checking for primes from 2
        
        // Loop until we find n prime numbers
        while (count < n) {
            // Check if currentNumber is prime directly inside the loop
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(currentNumber); i++) {
                if (currentNumber % i == 0) {
                    isPrime = false;
                    break; // Not a prime, exit inner loop
                }
            }
            
            // If it is prime, print it and increase our count
            if (isPrime) {
                System.out.print(currentNumber + " ");
                count++;
            }
            
            currentNumber++;
        }
        
        System.out.println();
    }
}