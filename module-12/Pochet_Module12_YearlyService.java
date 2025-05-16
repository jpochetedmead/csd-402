/*
 * Julio Pochet
 * 05/16/2025
 * Assignment: Module 12 – Yearly Auto Service Overloading
 *
 * Purpose: Demonstrates method overloading by calculating the cost of a yearly 
 * auto service visit based on optional oil change, tire rotation, and coupon discounts.
 */

public class Pochet_Module12_YearlyService {

    // --- Service Cost Constants ---
    private static final double BASE_SERVICE_COST = 99.99;
    private static final double OIL_CHANGE_COST = 29.99;
    private static final double TIRE_ROTATION_COST = 19.99;
    private static final double DEFAULT_COUPON = 10.00;

    // No-arg method: returns standard base service cost
    public static double yearlyService() {
        return BASE_SERVICE_COST;
    }

    // One-arg method: base + oil change
    public static double yearlyService(double oilChangeFee) {
        return BASE_SERVICE_COST + oilChangeFee;
    }

    // Two-arg method: base + oil change + tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return BASE_SERVICE_COST + oilChangeFee + tireRotationFee;
    }

    // Three-arg method: base + oil + tire - coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        return (BASE_SERVICE_COST + oilChangeFee + tireRotationFee) - coupon;
    }

    // Main method to test all yearlyService versions twice
    public static void main(String[] args) {
        System.out.println("=== Auto Service Cost Calculator ===");

        // No-arg tests
        System.out.printf("Test 1 - Basic Service: $%.2f%n", yearlyService());
        System.out.printf("Test 2 - Basic Service: $%.2f%n", yearlyService());

        // One-arg tests
        System.out.printf("Test 1 - Service + Oil Change: $%.2f%n", yearlyService(OIL_CHANGE_COST));
        System.out.printf("Test 2 - Service + Oil Change: $%.2f%n", yearlyService(34.99));

        // Two-arg tests
        System.out.printf("Test 1 - Service + Oil + Tire: $%.2f%n", yearlyService(OIL_CHANGE_COST, TIRE_ROTATION_COST));
        System.out.printf("Test 2 - Service + Oil + Tire: $%.2f%n", yearlyService(34.99, 24.99));

        // Three-arg tests
        System.out.printf("Test 1 - Full Service w/ Default Coupon: $%.2f%n",
                yearlyService(OIL_CHANGE_COST, TIRE_ROTATION_COST, DEFAULT_COUPON));
        System.out.printf("Test 2 - Full Service w/ Custom Coupon: $%.2f%n", yearlyService(34.99, 24.99, 15.00));
    }
}