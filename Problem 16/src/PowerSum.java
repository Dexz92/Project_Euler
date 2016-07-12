import java.math.BigInteger;



public class PowerSum {

	
	
	public static void main(String[] args){
		BigInteger number = BigInteger.valueOf(2).pow(1000);
		String temp = number.toString();
		int sum = 0;
		
		for(int i = 0; i<temp.length(); i++){
			int fix = (int) (temp.charAt(i) - '0');
			sum = sum + fix;
		}
		System.out.println(sum);
	}
}
