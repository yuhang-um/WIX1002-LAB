/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author cherrykoay
 */
import java.util.Scanner;
public class L4Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        long sum=0;
        long term=0;
        
        if (num<0){
            System.out.println("Please enter a positive integer");
        }else{
            for (int i=1; i<=num; i++){
                term+=i;
                sum+=term;
            }
            System.out.println("Sum of the series: " + sum);
        }
        input.close();
    }
}

