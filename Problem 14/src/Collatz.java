
public class Collatz {
	
	public Collatz(){
	}
	
	public int longestNumber(long number){
			int counter = 0;
			while(number != 1){
				number = (number % 2 == 0) ? number / 2: number * 3 + 1;
				counter++;
			}
			return counter;
		}

	public static void main(String[] args){
		Collatz collatz = new Collatz();
		int length = 0;
		int maxLength = 0;
		int maxNumber = 0;
		for(int i = 2; i < 1000000; i++){
			length = collatz.longestNumber(i);
			if(length > maxLength){
				maxLength = length;
				maxNumber = i;
			}
		}
		System.out.println("Maxnumber is: " + maxNumber);
	}
}
