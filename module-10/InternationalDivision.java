// Julio Pochet
// Date: 05/04/2025
// Assignment: Module 10 – International Division Class

// Purpose: Represents an international division with location and language.

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}