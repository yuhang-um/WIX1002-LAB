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
public class L4Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        int sumP1=0;
        int sumP2=0;
        boolean isP1Turn = true;
        while (true){
            String currentPlayer = isP1Turn ? "Player1" : "Player2";
            int currentScore = isP1Turn ? sumP1 : sumP2;
            System.out.println("***************************************");
            System.out.println(currentPlayer + " turn . Current score: " + currentScore);
            System.out.println("Press Enter to roll the dice. ");
            sc.nextLine();
            
            while (true){
                int roll = random.nextInt(1, 7);
                System.out.println("Rolled result: " + roll);
                if (isP1Turn){
                    sumP1+=roll;
                }else{
                    sumP2+=roll;
                }
                System.out.println("Current Scores: ");
                System.out.println("Player 1: " + sumP1 + "| Player 2: " + sumP2);
                
                if (sumP1>100 || sumP2>100){
                    break;
                }
                
                if (roll!=6){
                    break;
                }else{
                    System.out.println("Congrats, you rolled a 6! Please press enter to roll again. ");
                    sc.nextLine();
                }
            }
            if (sumP1>100 || sumP2>100){
                break;
            }
            
            isP1Turn = !isP1Turn;
        }
        
        if (sumP1>100){
            System.out.println("Player 1 win. Congratulations");
        }else{
            System.out.println("Player 2 win. Congratulations");
        }
        
    }
}
