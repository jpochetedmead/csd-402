// Julio Pochet
// 04/27/2025
// Module 9 Programming Assignment
// Purpose: Create a file if it doesn’t exist, write 10 random numbers, and then read and display them.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class PochetFileProgram {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        // Check if the file exists, if not create it
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists, appending new numbers.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return; // Exit program if file cannot be created
        }

        // Write 10 random numbers to the file
        try (FileWriter writer = new FileWriter(file, true)) { // 'true' to append
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // Random number between 0-99
                writer.write(randomNumber + " ");
            }
            writer.write("\n"); // Add a new line after writing
            System.out.println("10 random numbers written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read the file and display contents
        try (Scanner reader = new Scanner(file)) {
            System.out.println("\nContents of the file:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}