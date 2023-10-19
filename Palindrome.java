import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(isPalindrome(input) ? "The input is a palindrome." : "The input is not a palindrome.");
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
