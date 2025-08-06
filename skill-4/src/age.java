import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Period;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your birthdate (dd/MM/yyyy): ");
            String birthInput = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDate = LocalDate.parse(birthInput, formatter);
            LocalDate currentDate = LocalDate.now();

            if (birthDate.isAfter(currentDate)) {
                System.out.println("❌ Birthdate cannot be in the future.");
                return;
            }

            Period age = Period.between(birthDate, currentDate);
            System.out.println("✅ You are " + age.getYears() + " years, " +
                    age.getMonths() + " months, and " + age.getDays() + " days old.");
        } catch (DateTimeParseException e) {
            System.out.println("❌ Invalid date format! Please use dd/MM/yyyy (e.g., 05/08/2000)");
        }
    }
}
