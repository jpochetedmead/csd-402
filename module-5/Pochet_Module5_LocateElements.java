// Name: Julio Pochet
// Date: 4/11/2025
// Assignment: Module 5 – Locate Largest and Smallest Elements in a 2D Array
// Purpose: This program defines methods to locate the row and column indices of the
//          largest and smallest elements in both int and double 2D arrays.

public class Pochet_Module5_LocateElements {

    // Locate largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = { 0, 0 };
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = { 0, 0 };
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = { 0, 0 };
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = { 0, 0 };
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Main method to test all methods
    public static void main(String[] args) {
        int[][] intArray = {
                { 3, 9, 2 },
                { 8, 5, 1 },
                { 7, 6, 4 }
        };

        double[][] doubleArray = {
                { 3.5, 9.1, 2.2 },
                { 8.7, 5.3, 1.0 },
                { 7.4, 6.8, 4.6 }
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int element at: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest int element at: [" + smallestInt[0] + "][" + smallestInt[1] + "]");
        System.out.println("Largest double element at: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest double element at: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");
    }
}