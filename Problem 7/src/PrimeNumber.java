import java.util.ArrayList;


public class PrimeNumber {
	private ArrayList<Integer> list;
	
	
	public PrimeNumber(){
		list = new ArrayList<Integer>();
	}
	
	public void primeCheck(int numbers){
		for(int i = 1; i < numbers; i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		
	}
	
	public boolean isPrime(int i){
		for(int j = 2; j < i; j++){
			if(i % j == 0){
				return false;
			}
		}
		return true;
	}
	
	public void print(){
		System.out.println(list.get(10001));
		
	}
	
	public static void main(String[] args){
		PrimeNumber prime = new PrimeNumber();
		prime.primeCheck(110000);
		prime.print();
		
		
	}
}
