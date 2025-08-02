import java.util.Scanner;

public class Fibonaccinumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("\nFibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
