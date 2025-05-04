// Julio Pochet
// Date: 05/04/2025
// Assignment: Module 10 – UseDivision Main App

// Purpose: Creates and displays two domestic and two international divisions.

public class UseDivision {
    public static void main(String[] args) {
        // Create international division objects
        InternationalDivision intDiv1 = new InternationalDivision("Global Sales", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Marketing", 1002, "Japan", "Japanese");

        // Create domestic division objects
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Ops", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Ops", 2002, "California");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}