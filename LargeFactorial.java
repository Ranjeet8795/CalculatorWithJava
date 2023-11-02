import java.math.BigInteger;

public class LargeFactorial{

	//returns factorial of n
	static BigInteger factorial(int n) {
		
		//Initializing the result
		BigInteger f = new BigInteger("1"); // or BigInteger.ONE
		
		// There be Multiply f with 2, 3, ...n
		for (int i=2; i<=n; i++)
			f = f.multiply(BigInteger.valueOf(i));
		
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 30;
		System.out.println("Large Factorial of given Number is");
		System.out.println(factorial(n));
		
		
	}

}