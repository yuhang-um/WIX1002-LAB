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
public class L5Q3 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        System.out.println("Enter number of employees(N): ");
        int N = input.nextInt();
        
        // Generate random working hours
        int [][] working_hours = new int [N][7];
        for (int i=0; i<working_hours.length; i++) {
            for (int j=0; j<working_hours[i].length; j++) {
                working_hours[i][j] = random.nextInt(1, 9);
            }
        }
        
        // Display table heading
        String format = "%-12s%5s%5s%5s%5s%5s%5s%5s%7s%n";
        System.out.printf(format, "Employee", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Total");
        
        // Display working hours and total for each
        for (int i=0; i<working_hours.length; i++) {
            int rowTotal = 0;
            System.out.printf("%-12s", (i+1));
            for (int j=0; j<working_hours[i].length; j++) {
                System.out.printf("%5s", working_hours[i][j]);
                rowTotal += working_hours[i][j];
            }
            System.out.printf("%7s%n", rowTotal);
        }
        
    }
}


