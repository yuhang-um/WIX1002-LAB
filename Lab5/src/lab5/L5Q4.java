/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author cherrykoay
 */

public class L5Q4 {
    public static void main (String [] args) {
        int [][] matrix1 = {
            {1, 5, 7},
            {3, 6, 9}, 
            {5, 3, 8}
        };
        int [][] matrix2 = new int [3][3];
        
        System.out.println("3 by 3 Matrix");
        for (int i=0; i<matrix1.length; i++) {
            for (int j=0; j<matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i=0; i<matrix2.length; i++) {
            for (int j=0; j<matrix2[i].length; j++) {
                matrix2[i][j] = matrix1[3-j-1][i];
            }
        }
        
        System.out.println("After rotates 90 degrees clockwise");
        for (int i=0; i<matrix2.length; i++) {
            for (int j=0; j<matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
