import java.util.Scanner;

public class Wideningtype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();

        long longValue = intValue;

        float floatValue = longValue;

        System.out.println("\n--- Widening Type Conversion ---");
        System.out.println("You entered (int)       : " + intValue);
        System.out.println("After widening to long  : " + longValue);
        System.out.println("After widening to float : " + floatValue);

        sc.close(); 
        }
}
