import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class datetime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date-time format (e.g., dd/MM/yyyy HH:mm:ss or MM-dd-yyyy hh:mm a):");
        String userInputFormat = sc.nextLine();


        if (userInputFormat.contains("mm") && !userInputFormat.contains("HH")) {
            System.out.println("⚠️ You used 'mm' (minutes), but you may have meant 'MM' (month).");
            System.out.println("🔁 Automatically correcting your format...");
            userInputFormat = userInputFormat.replaceAll("(?<!H)mm", "MM");  
            }


        if (!userInputFormat.matches(".*[dMyHhsa].*")) {
            System.out.println("❌ You entered a literal date or an invalid format.");
            System.out.println("✅ Please enter a pattern like: dd/MM/yyyy HH:mm:ss or MM-dd-yyyy hh:mm a");
        } else {
            try {
                
                Date currentDate = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat(userInputFormat);
                String formattedDate = formatter.format(currentDate);


                System.out.println("✅ Current Date and Time in your format: " + formattedDate);
            } catch (IllegalArgumentException e) {
                System.out.println("❌ Invalid date-time format! Please check your pattern.");
            }
        }

        sc.close();
    }
}

