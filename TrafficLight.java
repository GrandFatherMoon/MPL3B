/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**File name:TrafficLight.java
 *Purpose: Class for defining methods with attributes for traffic light color 
 * and durationD
 * @author emre batir
 */
public class TrafficLight {
    private String color;
    private int Duration;
    
    public void setColor(String lite)
    {
        color = lite;
    }
    
    public void setDuration(int time)
    {
        Duration = time;
    }
    
    public String lightCheck()
    {
        return color;
    }
    
    public int timeCheck()
    {
        return Duration;
    }
}
