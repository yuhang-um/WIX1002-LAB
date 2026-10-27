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
public class LabQ4 {
    public static void main (String[]args){
        Random random = new Random();
        
        //Player 1
        int Player1Roll1 = random.nextInt(1,7);
        int Player1Roll2 = random.nextInt(1,7);
        int Player1Total = Player1Roll1 + Player1Roll2;
        
        //Player 2
        int Player2Roll1 = random.nextInt(1,7);
        int Player2Roll2 = random.nextInt(1,7);
        int Player2Total = Player2Roll1 + Player2Roll2;
        
        //Display rolling result
        System.out.println("Player 1 rolled result: " + Player1Roll1 + " + " + Player1Roll2 + " = " + Player1Total);
        System.out.println("Player 2 rolled result: " + Player2Roll1 + " + " + Player2Roll2 + " = " + Player2Total);
        
        //compare
        if (Player1Total > Player2Total){
            System.out.println("Player 1 win");
        }else{
            System.out.println("Player 2 win");
        }
        
    }
    
}
