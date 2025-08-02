import java.util.Scanner;

public class Prgrm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("Character array as string: " + new String(charArray));

        System.out.println("User input string        : " + userInput);

        String convertedString = new String(charArray);
        System.out.println("Converted String object  : " + convertedString);

        sc.close();
    }
}
