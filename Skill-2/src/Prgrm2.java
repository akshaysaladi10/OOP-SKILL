import java.util.Scanner;

public class Prgrm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String input1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(input1);

        System.out.print("Enter the second string: ");
        String input2 = sc.nextLine();
        StringBuilder sb2 = new StringBuilder(input2);

        System.out.println("\n--- Original Strings ---");
        System.out.println("First StringBuilder  : " + sb1);
        System.out.println("Second StringBuilder : " + sb2);

        sb2.append(sb1);  

        System.out.println("\n--- After Joining ---");
        System.out.println("First StringBuilder  : " + sb1); 
        System.out.println("Second StringBuilder : " + sb2); 
        
        sc.close();
    }
}
