import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the value to search: ");
            int target = sc.nextInt();

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("The value " + target + " is present " + count + " time(s) in the array.");
            } else {
                System.out.println("The value " + target + " is not present in the array.");
            }
        }
    }
}
