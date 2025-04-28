// Julio Pochet
// 04/27/2025
// Module 9 Programming Assignment
// Purpose: Create an ArrayList of Strings, display all items, and use try/catch to access a user-selected element safely.

import java.util.ArrayList;
import java.util.Scanner;

public class PochetArrayListProgram {

    public static void main(String[] args) {
        // Create an ArrayList with 10 fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Elderberry");
        fruits.add("Pineapple");
        fruits.add("Grape");
        fruits.add("Honeydew");
        fruits.add("Kiwi");
        fruits.add("Lemon");

        // Print all elements using a for-each loop
        System.out.println("Here are the fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter an index (0-9) to view a fruit again: ");

        try {
            Integer userChoice = Integer.parseInt(input.nextLine()); // Autoboxing user input
            String chosenFruit = fruits.get(userChoice); // Auto-unboxing when retrieving
            System.out.println("You selected: " + chosenFruit);
        } catch (Exception e) {
            System.out.println("Exception Thrown: Out of Bounds");
        }

        input.close();
    }
}