import java.util.Scanner;

public class Prgrm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base string: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);

        System.out.println("\nOriginal StringBuffer: " + sb);

        sb.append(" Java");
        System.out.println("After append(\" Java\"): " + sb);

        sb.insert(0, "Welcome ");
        System.out.println("After insert(0, \"Welcome \"): " + sb);

        sb.replace(8, 15, "to");
        System.out.println("After replace(8, 15, \"to\"): " + sb);

        sb.delete(3, 7);
        System.out.println("After delete(3, 7): " + sb);

        sb.reverse();
        System.out.println("After reverse(): " + sb);

        System.out.println("Length of StringBuffer: " + sb.length());
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        sc.close();
    }
}
