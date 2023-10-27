import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.next();

        // Use Integer.parseInt() to convert binary string to decimal
        int decimalNumber = Integer.parseInt(binaryStr, 2);

        // Display the binary and decimal numbers
        System.out.println("Binary number: " + binaryStr);
        System.out.println("Decimal number: " + decimalNumber);
    }
}
