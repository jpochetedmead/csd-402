// Julio Pochet
// Date: 05/04/2025
// Assignment: Module 10 – Division Abstract Class

// Purpose: Abstract base class for company divisions.

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display(); // Abstract method
}