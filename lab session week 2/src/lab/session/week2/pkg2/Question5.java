/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week2.pkg2;

/**
 *
 * @author cherrykoay
 */
//Random Options:
// java.util.Random (R must be capital letter because it is a class)
// Math.Random()
// ThreadLocalRandom
// Secure Random

import java.util.Random;
public class Question5 {
    public static void main (String[]args){
        Random random = new Random();
        int rand = random.nextInt(0, 10001);
        System.out.println("The number generated is: " + rand);
        System.out.println("The sum of digits using For loops is: " + SumDigitsUsingFor(rand));
        System.out.println("The sum of digits using While loops is: " + SumDigitsUsingWhile(rand));
        
    }
    
    public static int SumDigitsUsingFor(int number){
        int sum=0;
        for (; number>0; number/=10){
            sum+=number%10;
        }
        return sum;
    }
    
    public static int SumDigitsUsingWhile(int number){
        int sum=0;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
