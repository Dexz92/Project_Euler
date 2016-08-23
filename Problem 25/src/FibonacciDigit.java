import java.math.BigInteger;
import java.util.HashMap;

public class FibonacciDigit {
	private static HashMap<Integer,BigInteger> map = new HashMap<Integer,BigInteger>();

	public static void main(String[] args) {
		BigInteger value;
		int counter = 2;	
		do{
			value = fibonacci(counter);
			counter++;
		}while(value.toString().length() < 1000);
		System.out.println(value);
		System.out.println(counter);
		
	}

	public static BigInteger fibonacci(int n) {
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}
		if (map.containsKey(n)) {
			return map.get(n);
		}
		BigInteger value = fibonacci(n - 2).add(fibonacci(n - 1));
		map.put(n, value);
		return value;
	}
}
