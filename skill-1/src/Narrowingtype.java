import java.util.Scanner;

public class Narrowingtype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a double value
        System.out.print("Enter a decimal (double) value: ");
        double doubleValue = sc.nextDouble();

        // Narrowing conversion from double to int
        int intValue = (int) doubleValue; // Explicit casting required

        // Print both original and converted values
        System.out.println("\n--- Narrowing Type Conversion ---");
        System.out.println("Original double value : " + doubleValue);
        System.out.println("After casting to int  : " + intValue);

        sc.close(); // Close scanner to prevent resource leak
    }
}
