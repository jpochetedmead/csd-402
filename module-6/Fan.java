/*
 * Name: Julio Pochet Edmead
 * Date: 04/12/2025
 * Assignment: Module 6 – Fan Class
 * Purpose: This class models a basic fan with speed settings, on/off state, radius, and color.
 */

public class Fan {

    // Speed constants to control fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan properties
    private int speed; // Default: STOPPED
    private boolean on; // Default: false
    private double radius; // Default: 6.0
    private String color; // Default: "white"

    // No-argument constructor – uses default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with custom values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Returns a simple summary of the fan's current state
    public String toString() {
        if (on) {
            return "Fan is ON → Speed: " + speed + ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is OFF → Radius: " + radius + ", Color: " + color;
        }
    }
}