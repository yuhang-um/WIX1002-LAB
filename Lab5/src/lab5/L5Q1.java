/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author cherrykoay
 */
import java.util.*;
public class L5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        System.out.println("Enter number of students (N): ");
        int N = input.nextInt();
        int [] scores = new int[N];
        
        for (int i=0; i<N; i++){
            scores[i] = random.nextInt(101);
        }
        
        int highest = scores[0];
        int lowest = scores [0];
        int total = scores[0];
        
        for (int i=1; i<scores.length; i++) {
            total = total + scores[i];
            if (scores[i]>highest) {
                highest = scores[i];
            }
            if (scores[i]<lowest) {
                lowest = scores[i];
            }
        }
        double average = (double) total/scores.length;
        
        System.out.print("The list of scores: ");
        for (int i=0; i<scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f%n", average);
        
    }
    
}
