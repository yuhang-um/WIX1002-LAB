/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author cherrykoay
 */
import java.util.*;
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        
        System.out.print("The factors are: ");
        boolean first=true;
        
        for (int i=1; i<=num; i++){
            if (num%i==0){
                if (!first){
                    System.out.print(", ");
                }
            System.out.print(i);
            first=false;
            }
        }
        input.close();
    }
    
}
