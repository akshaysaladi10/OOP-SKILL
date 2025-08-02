import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        boolean isPerfectSquare = false;

        if (number >= 0) {
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                isPerfectSquare = true;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        sc.close();
    }
}
