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
public class L4Task {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Get the input from users Input
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation Processing
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
            int dayUntilAug = dayUntilMay + 31 + 30 + 31;
            int dayUntilNov = dayUntilAug + 30 + 31 + 30;
            int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;
            int firstDayOfAug = (firstDayOfYear + dayUntilAug) % 7;
            int firstDayOfNov = (firstDayOfYear + dayUntilNov) % 7; 

            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n"; // string formatting - different types of string formatting

            // 3. Print the calendar of November Output
            System.out.println("November Calendar");
            System.out.printf(format, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
            for (int i = 0; i < (firstDayOfNov+6)%7; i++) {
                System.out.printf(columnFormat, "");
            }
            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);
                if ((i + firstDayOfMay) % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
