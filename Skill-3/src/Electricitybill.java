import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of electricity units consumed: ");
        int units = sc.nextInt();

        int ratePerUnit = 0;
        int extraCharge = 0;
        int totalAmount = 0;

        if (units >= 51 && units <= 100) {
            ratePerUnit = 3;
            totalAmount = units * ratePerUnit;
        } else if (units >= 101 && units <= 300) {
            ratePerUnit = 5;
            extraCharge = 100;
            totalAmount = (units * ratePerUnit) + extraCharge;
        } else if (units >= 301 && units <= 450) {
            ratePerUnit = 6;
            extraCharge = 200;
            totalAmount = (units * ratePerUnit) + extraCharge;
        } else if (units > 450) {
            ratePerUnit = 8;
            extraCharge = 250;
            totalAmount = (units * ratePerUnit) + extraCharge;
        } else {
            System.out.println("No bill for units less than or equal to 50.");
            sc.close();
            return;
        }

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Units Consumed : " + units);
        System.out.println("Rate per Unit  : " + ratePerUnit + " Rs");
        System.out.println("Extra Charges  : " + extraCharge + " Rs");
        System.out.println("Total Amount   : " + totalAmount + " Rs");

        sc.close();
    }
}
