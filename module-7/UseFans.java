/*
 * Name: Julio Pochet Edmead
 * Date: 04/20/2025
 * Assignment: Module 7 – UseFans Class
 * Purpose: This test program creates and displays a collection of Fan objects using custom methods.
 */

import java.util.ArrayList;

public class UseFans {

    // Displays a single fan without using toString()
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON → Speed: " + fan.getSpeed()
                    + ", Radius: " + fan.getRadius()
                    + ", Color: " + fan.getColor());
        } else {
            System.out.println("Fan is OFF → Radius: " + fan.getRadius()
                    + ", Color: " + fan.getColor());
        }
    }

    // Displays all fan objects in a list
    public static void displayAllFans(ArrayList<Fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.print("Fan #" + (i + 1) + ": ");
            displayFan(fans.get(i));
        }
    }

    public static void main(String[] args) {

        // Creating a collection of fan objects
        ArrayList<Fan> fanList = new ArrayList<>();

        // Adding different fans to the list
        fanList.add(new Fan()); // Default fan
        fanList.add(new Fan(Fan.FAST, true, 9.0, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 7.5, "gray"));
        fanList.add(new Fan(Fan.SLOW, true, 8.0, "green"));

        // Displaying the full collection of fans
        System.out.println("=== Fan Collection Output ===");
        displayAllFans(fanList);
    }
}