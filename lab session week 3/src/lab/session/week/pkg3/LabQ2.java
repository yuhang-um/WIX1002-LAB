/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.session.week.pkg3;

/**
 *
 * @author cherrykoay
 */
import java.util.*;

public class LabQ2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(6);
        String words; 

        switch (randNum) {
            case 0:
                words = "zero";
                break;
            case 1:
                words = "one";
                break;
            case 2:
                words = "two";
                break;
            case 3:
                words = "three";
                break;
            case 4:
                words = "four";
                break;
            case 5:
                words = "five";
                break;
            default:
                words = "unknown";
                break;
        }

        System.out.println(randNum + " is " + words + ".");
    }
}