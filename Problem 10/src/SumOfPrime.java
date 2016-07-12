import java.util.ArrayList;


public class SumOfPrime {
	private ArrayList<Integer>list;
	
	public SumOfPrime(){
		list = new ArrayList<Integer>();
	}
	
	public boolean isPrime(int n){
		for(int j = 2; j <= Math.sqrt(n); j++){
			if(n % j == 0){
				return false;
			}
		}
		return true;
	}
	
	public void addPrime(){
		for(int i = 2; i <= 2000000; i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
	}
	public void printList(){
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i) + " ");
		}
	}
	
	public long calculate(){
		long sum = 0;
		for(int i = 0; i < list.size(); i++){
			sum = sum + list.get(i);
		}
		return sum;
	}

	public static void main(String[] args){
		SumOfPrime prime = new SumOfPrime();
		prime.addPrime();
		prime.printList();
		System.out.println("The sum is: " + prime.calculate());
	}
}
