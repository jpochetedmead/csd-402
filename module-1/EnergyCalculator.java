/*
 * Name: Julio Pochet
 * Date: 03/21/2025
 * Assignment: Module 1 - Programming Assignment
 *
 * Purpose: This program asks the user for the amount of water and the
 * starting and ending temperatures. Then it calculates how much energy
 * is needed to heat the water.
 */

import javax.swing.JOptionPane;
import java.util.logging.Logger;

public class EnergyCalculator {

    // Create a Logger instance for this class
    private static final Logger logger = Logger.getLogger(EnergyCalculator.class.getName());

    public static void main(String[] args) {

        // Get water amount from user
        String waterStr = JOptionPane.showInputDialog("Enter water amount in kilograms:");
        double waterKg = Double.parseDouble(waterStr);

        // Get initial temp from user
        String tempStartStr = JOptionPane.showInputDialog("Enter starting temperature in Celsius:");
        double tempStart = Double.parseDouble(tempStartStr);

        // Get final temp from user
        String tempEndStr = JOptionPane.showInputDialog("Enter ending temperature in Celsius:");
        double tempEnd = Double.parseDouble(tempEndStr);

        // Calculate energy
        double energy = waterKg * (tempEnd - tempStart) * 4184;

        // Show result in a popup
        JOptionPane.showMessageDialog(null, "Energy needed: " + energy + " Joules");

        // Log the result instead of printing
        logger.info("Energy needed: " + energy + " Joules");
    }
}
