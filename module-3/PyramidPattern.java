/*
 * Name: Julio Pochet
 * Date: 03/30/2025
 * Assignment: Module 3 - Nested Loops Pattern
 *
 * Purpose:
 * This program prints a centered pyramid of powers of 2.
 * All @ symbols are aligned to the far-right side.
 */

public class PyramidPattern {
    public static void main(String[] args) {
        int totalRows = 7;
        String[] lines = new String[totalRows];

        // Step 1: Build each row of numbers (without @)
        for (int i = 0; i < totalRows; i++) {
            String row = "";

            // Left side
            for (int j = 0; j <= i; j++) {
                row += (int) Math.pow(2, j) + " ";
            }

            // Right side
            for (int j = i - 1; j >= 0; j--) {
                row += (int) Math.pow(2, j) + " ";
            }

            lines[i] = row.trim(); // trim trailing space
        }

        // Step 2: Get the length of the longest row
        int maxLength = lines[totalRows - 1].length();

        // Step 3: Print each row with leading and in-between spacing, then @ aligned
        for (String line : lines) {
            // Center the row
            int padding = (maxLength - line.length()) / 2;

            // Print leading spaces to center the pyramid
            for (int s = 0; s < padding; s++) {
                System.out.print(" ");
            }

            System.out.print(line); // print the number pyramid

            // Calculate space needed between last number and far-right @
            int spacesToAt = maxLength - (padding + line.length()) + 2; // +2 to breathe a little

            for (int s = 0; s < spacesToAt; s++) {
                System.out.print(" ");
            }

            System.out.println("@"); // print the @ in the same column every time
        }
    }
}