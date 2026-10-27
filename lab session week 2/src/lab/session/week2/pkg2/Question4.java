/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week2.pkg2;

/**
 *
 * @author cherrykoay
 */
import java.util.Scanner;
public class Question4 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int totalSeconds = sc.nextInt();
        
        int hours = totalSeconds/3600;
        int remainingSecond= totalSeconds%3600;
        
        int minute = remainingSecond/60;
        int seconds = remainingSecond%60;
        
        System.out.println(totalSeconds + " seconds is " + hours + " hours " + minute + " minutes " + seconds + " seconds");
        
    }
}
