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
public class L5Q6 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int N = input.nextInt();
        int [][] pascal = new int [N][N];
        
        for (int i=0; i<pascal.length; i++) {
            for (int j=0; j<pascal[i].length; j++) {
                if (j==0) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = 0;
                }
            }
        }
        
        for (int i=1; i<pascal.length; i++) {
            for (int j=1; j<pascal[i].length; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
        
        System.out.println("The Pascal Triangle with " + N + " row(s)");
        for (int i=0; i<pascal.length; i++) {
            for (int j=0; j<pascal[i].length; j++) {
                System.out.print(pascal[i][j] + "   ");
            }
            System.out.println();
        }
        input.close();
    }
}
