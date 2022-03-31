//0,1,1,2,3,5,8,13,21,......
// fibonacci (0) = 0
// fibonacci (1) = 1
// fibonacci (n) = fibonacci (n-1) + fibonacci(n-2)

import java.math.BigInteger;

public class FibonacciCalculator{
	private static BigInteger TWO = BigInteger.valueOf(2);

	//recursive implementation of method fibonacci
	public static BigInteger fibonacci(BigInteger number){
		if (number .equals(BigInteger.ONE) || number.equals(BigInteger.ZERO)){
			return number;
		}//end if
		else {
			return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
		}//end else
	}//end fibonacci

	// main method
	public static void main(String[] args){
		//BigInteger n = BigInteger.valueOf(3);
		for(int n = 0; n <= 25; n++){
			System.out.printf("Fibonacci of %d is %d\n", n, fibonacci(BigInteger.valueOf(n)));
		}
		//System.out.printf("Fibonacci of %d is %d", n, fibonacci(n));
	}//end main
}// end class