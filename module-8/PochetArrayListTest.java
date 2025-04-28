// Name: Julio Pochet Edmead
// Date: 04/27/2025
// Assignment: Module 8 Programming Assignment
// Purpose: This program gets numbers from the user, stores them in an ArrayList, and finds the biggest number entered.

import java.util.ArrayList;
import java.util.Scanner;

public class PochetArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer biggest = list.get(0);
        for (Integer number : list) {
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers one by one. Enter 0 when you are done.");

        int userNumber;
        do {
            userNumber = input.nextInt();
            numbers.add(userNumber);
        } while (userNumber != 0);

        Integer largest = max(numbers);

        System.out.println("The largest number you entered is: " + largest);

        input.close();
    }
}