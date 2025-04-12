/*
 * Name: Julio Pochet Edmead
 * Date: 04/12/2025
 * Assignment: Module 6 – Fan Test Program
 * Purpose: This test program creates and manipulates two Fan objects to show functionality.
 */

public class FanTest {
    public static void main(String[] args) {

        // Creating a fan using default settings
        Fan fan1 = new Fan();

        // Creating a fan with custom values
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");

        // Displaying the default fan's state
        System.out.println("Fan 1 (Default):");
        System.out.println(fan1);

        // Changing settings on fan1
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(7.5);
        fan1.setColor("black");

        // Showing the updated state of fan1
        System.out.println("\nFan 1 (Updated):");
        System.out.println(fan1);

        // Displaying fan2 (custom) state
        System.out.println("\nFan 2 (Custom):");
        System.out.println(fan2);
    }
}