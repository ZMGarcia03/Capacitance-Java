import java.util.Scanner;

public class CapacitorCalculator {

    public static double calculateCapacitance(double resistance, double timeConstant) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("Resistance must be greater than zero.");
        }
        if (timeConstant <= 0) {
            throw new IllegalArgumentException("Time constant must be greater than zero.");
        }
        return timeConstant / resistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the resistance (R) in ohms: ");
            double resistance = scanner.nextDouble();

            System.out.print("Enter the time constant (τ) in seconds: ");
            double timeConstant = scanner.nextDouble();

            double capacitance = calculateCapacitance(resistance, timeConstant);
            System.out.printf("The needed capacitance value is: %.6f farads%n", capacitance);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
