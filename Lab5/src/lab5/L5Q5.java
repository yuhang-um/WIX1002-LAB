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
public class L5Q5 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        
        // Generate 20 random integers and display the result
        System.out.println("A list of 20 random integer within 0 to 100");
        int [] numbers = new int [20];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            System.out.print(numbers[i] + ", ");
        }
        
        // Sort the array
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 -i];
            numbers[numbers.length - 1 -i] = temp;
        }
        System.out.println();
        
        System.out.println("Array in descending order");
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        
        // Accept an input from user
        System.out.print("Enter a number to search: ");
        int key = input.nextInt();
        
        // Linear search
        int found = -1;
        int count = 0;
        for (int i=0; i<numbers.length; i++) {
            count++;
            if (numbers[i]==key){
                found = 1;
                break;
            }
        }
        if (found>=0) {
            System.out.println(key + " found");
            System.out.println("Linear Search - " + count + " loop(s)");
        } else {
            System.out.println("Not found after " + count + " loop(s)");
        }
        
        // Binary search
        int low = 0;
        int high = numbers.length -1;
        int founder = -1;
        int counter = 0;
        while (low<=high) {
            int mid = (low+high)/2; //view index
            counter++;
            if (numbers[mid] == key) {
                founder=mid;
                break;
            } else if (numbers[mid] > key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (founder>=0) {
            System.out.println(key + " found");
            System.out.println("Binary Search - " + counter + " loop(s)");
        } else {
            System.out.println("Not found after " + counter + " loop(s)");
        }
        input.close();
    }
}
