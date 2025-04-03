// Name: Julio Pochet
// Date: 04/03/2025
// Assignment: Module 4 – Overloaded Average Methods
// Purpose: This program calculates the average of arrays with different data types using overloaded methods.

public class AverageCalculator {

    // Calculates the average of a short array
    public static short average(short[] array) {
        int sum = 0; // Use int to avoid overflow
        for (short number : array) {
            sum += number;
        }
        return (short) (sum / array.length); // Convert back to short
    }

    // Calculates the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // Calculates the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // Calculates the average of a double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // Main method to run and test the average methods
    public static void main(String[] args) {
        // Sample arrays with different sizes and types
        short[] shortArray = { 2, 4, 6 }; // 3 elements
        int[] intArray = { 10, 20, 30, 40 }; // 4 elements
        long[] longArray = { 100L, 200L, 300L, 400L, 500L }; // 5 elements
        double[] doubleArray = { 1.5, 2.5, 3.5, 4.5, 5.5, 6.5 }; // 6 elements

        // Show each array and its average
        System.out.println("Short array:");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray) + "\n");

        System.out.println("Int array:");
        printArray(intArray);
        System.out.println("Average: " + average(intArray) + "\n");

        System.out.println("Long array:");
        printArray(longArray);
        System.out.println("Average: " + average(longArray) + "\n");

        System.out.println("Double array:");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray) + "\n");
    }

    // Print method for short array
    public static void printArray(short[] array) {
        for (short number : array) {
            System.out.print(number + " ");
        }
        System.out.println(); // Print new line after array
    }

    // Print method for int array
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Print method for long array
    public static void printArray(long[] array) {
        for (long number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Print method for double array
    public static void printArray(double[] array) {
        for (double number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}