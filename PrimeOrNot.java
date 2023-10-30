public class PrimeOrNot {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 17, 20, 25};

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is Not a Prime Number");
            }
        }
    }
}
