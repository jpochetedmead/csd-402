// Name: Julio Pochet
// Date: 03/30/2025
// Assignment: Module 2 – Rock-Paper-Scissors Game
// Purpose: Play Rock-Paper-Scissors against the computer with input validation and replay support.

import java.util.Scanner;

public class MyRockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");

        while (keepPlaying) {
            // Generate computer move (1 = Rock, 2 = Paper, 3 = Scissors)
            int computerPick = (int) (Math.random() * 3) + 1;

            // Show move options
            System.out.println("\nChoose your move:");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            System.out.print("Your choice: ");

            int playerPick = 0;

            // Input validation
            if (scanner.hasNextInt()) {
                playerPick = scanner.nextInt();

                if (playerPick < 1 || playerPick > 3) {
                    System.out.println("❌ Invalid number. Please pick 1, 2, or 3.");
                    continue; // restart loop
                }
            } else {
                System.out.println("❌ Not a valid number. Please try again.");
                scanner.next(); // clear bad input
                continue;
            }

            // Show both choices
            System.out.println("You picked: " + moveToWord(playerPick));
            System.out.println("Computer picked: " + moveToWord(computerPick));

            // Determine winner
            if (playerPick == computerPick) {
                System.out.println("😐 It’s a tie!");
            } else if ((playerPick == 1 && computerPick == 3) ||
                    (playerPick == 2 && computerPick == 1) ||
                    (playerPick == 3 && computerPick == 2)) {
                System.out.println("🎉 You win!");
            } else {
                System.out.println("💻 Computer wins!");
            }

            // Ask to play again
            System.out.print("\nWanna play again? (y/n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                keepPlaying = false;
                System.out.println("👋 Thanks for playing!");
            }
        }

        scanner.close();
    }

    // Converts a move number into a readable word
    public static String moveToWord(int move) {
        if (move == 1)
            return "Rock";
        if (move == 2)
            return "Paper";
        return "Scissors";
    }
}