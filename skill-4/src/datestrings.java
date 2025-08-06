import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class datestrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a date (in yyyy-MM-dd format):");
            String input = sc.nextLine();

            LocalDate date = LocalDate.parse(input);
            String dayOfWeek = date.getDayOfWeek().toString();

            System.out.println("The day of the week for " + input + " is: " + dayOfWeek);
        } catch (DateTimeParseException e) {
            System.out.println("❌ Invalid date format! Please enter in yyyy-MM-dd format (e.g., 2025-07-27)");
        }
    }
}
