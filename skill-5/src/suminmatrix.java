import java.util.Scanner;

public class suminmatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the square matrix (n x n): ");
            int n = sc.nextInt();

            int[][] matrix = new int[n][n];

            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            
            System.out.println("Sum of each row:");
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println("Row " + (i + 1) + ": " + rowSum);
            }

            
            System.out.println("Sum of each column:");
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Column " + (j + 1) + ": " + colSum);
            }
        }
    }
}
