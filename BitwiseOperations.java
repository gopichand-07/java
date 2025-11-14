import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;

        System.out.println("\n--- Bitwise Operations ---");
        System.out.println("a in binary: " + Integer.toBinaryString(a));
        System.out.println("b in binary: " + Integer.toBinaryString(b));
        System.out.println("a & b = " + Integer.toBinaryString(andResult));
        System.out.println("a | b = " + Integer.toBinaryString(orResult));
        System.out.println("a ^ b = " + Integer.toBinaryString(xorResult));

        sc.close();
    }
}
