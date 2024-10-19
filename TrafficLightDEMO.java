/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**File name: TrafficLightDEMO.java
 *Purpose: To use the TrafficLight class for its output 
 * @author emre batir
 */
public class TrafficLightDEMO {
    
    public static void main(String[] args)
    {
        TrafficLight light = new TrafficLight();
        light.setDuration(30);
        light.setColor("Green");
        System.out.println("The traffic light is " + light.lightCheck() + 
                " for " + light.timeCheck() + " seconds");
        light.setColor("Red");
        light.setDuration(20);
        System.out.println("The traffic light is " + light.lightCheck() + 
                " for " + light.timeCheck() + " seconds");
    }
    
}
/*
Output
The traffic light is Green for 30 seconds
The traffic light is Red for 20 secondsTraffivcTraff
*/