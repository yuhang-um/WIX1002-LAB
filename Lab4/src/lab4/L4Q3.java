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
public class L4Q3 {
    
    public static double calculateAverage(double sum, int count) {
        if (count<0) {
            return 0;
        }else{
            return sum/count;
        }
    }
    
    public static double calculateStandardDevation(double sum, double sumOfSquare, int count) {
        if (count<2) {
            return 0;
        }else{
            double numerator = sumOfSquare - ((sum*sum)/count);
            return Math.sqrt(numerator/(count-1));
        }
    }
    
    public static void displayStatistics(double min, double max, double sum, double sumOfSquare, int count) {
        if (count==0){
            System.out.println("No scores were entered. ");
        }
        
        double average = calculateAverage(sum, count);
        double sd = calculateStandardDevation(sum, sumOfSquare, count);
        
        System.out.println("Minimum Score: " + (int)min);
        System.out.println("Maximum Score: " + (int)max);
        System.out.printf("Average Scores: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", sd);
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a score [negative score to quit]: ");
        double score = sc.nextDouble();
        if (score<0){
            System.out.println("No scores were entered. ");
        }else{
            double min=score;
            double max=score;
            double sum=score;
            double sumOfSquare=score*score;
            int count=1;
            
            while(true) {
                System.out.print("Enter a score [negative score to quit]: ");
                score = sc.nextDouble();
                if (score<0){
                    break;
                }
                if (score<min){
                    min=score;
                }
                if (score>max){
                    max=score;
                }
                sum=sum+score;
                sumOfSquare =sumOfSquare + (score * score);
                count++;
            }
            displayStatistics(min, max, sum, sumOfSquare, count);
        }
        sc.close();
    }
}
