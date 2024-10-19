/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**File name:MinutesConversion.java
 * Purpose: to convert minutes given by user to hours and days
 *
 * @author emre batir
 */
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args)
    {
        int minutes;
        double hours;
        double days;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give me a whole number of minutes.");
        minutes = scan.nextInt();
        hours = minutes / 60.0;
        days = hours / 24.0;
        
        System.out.println(minutes + " minutes is " + hours + " hours or " + 
                days + " days");
        
    }
}
/*OUTPUT
Give me a whole number of minutes.
6000
6000 minutes is 100.0 hours or 4.166666666666667 days
*/