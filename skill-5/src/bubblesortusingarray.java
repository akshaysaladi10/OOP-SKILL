import java.util.Scanner;

public class bubblesortusingarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Bubble sort logic
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.println("Sorted array using Bubble Sort:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
