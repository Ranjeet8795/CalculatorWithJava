public class DuplicateArray {
    public static void main(String[] args) {
        // Initialize an array
        int arr[] = {5, 6, 4, 1, 0, 0, 9, 8, 9, 5};
        System.out.println("Duplicate Numbers given below: ");
        
        // Logic for finding duplicate values
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Compare two elements with each other
                if (arr[i] == arr[j]) {
                    // Print duplicate value
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
