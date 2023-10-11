import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Arithmetic Operations as follows:");
        System.out.println("1. Addition (+), 2. Subtraction (-), 3. Multiplication (*), 4. Division (/)");
    
        // Select choice here
        System.out.print("Please select an operation (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        // Add the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        
        // Add the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1); // Exit the program with an error code
                }
                break;
            default:
                System.out.println("Error: Invalid choice.");
                System.exit(1); // Exit the program with an error code
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
