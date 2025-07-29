import java.util.Scanner;

public class Wrappperclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intPrimitive = sc.nextInt();

        System.out.print("Enter a double value: ");
        double doublePrimitive = sc.nextDouble();

        Integer intWrapper = Integer.valueOf(intPrimitive);
        Double doubleWrapper = Double.valueOf(doublePrimitive);

        int unboxedInt = intWrapper.intValue();
        double unboxedDouble = doubleWrapper.doubleValue();

        Integer autoBoxed = intPrimitive;      
        int autoUnboxed = intWrapper;          

        System.out.println("\n--- Wrapper Class Demonstration ---");
        System.out.println("Primitive int           : " + intPrimitive);
        System.out.println("Wrapped Integer object  : " + intWrapper);
        System.out.println("Unboxed int             : " + unboxedInt);
        System.out.println("Auto-boxed Integer      : " + autoBoxed);
        System.out.println("Auto-unboxed int        : " + autoUnboxed);

        System.out.println("Primitive double        : " + doublePrimitive);
        System.out.println("Wrapped Double object   : " + doubleWrapper);
        System.out.println("Unboxed double          : " + unboxedDouble);

        sc.close();
    }
}
