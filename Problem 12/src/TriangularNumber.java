

public class TriangularNumber {

	public TriangularNumber(){
	}
	
	public int divisor(int number){
		int counter = 0;
		for(int i = 1; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				counter += 2;
			}
		}
		return counter;
	}
	
	public void calculate(){
		int iteration = 1;
		int size = 1;
		int factor = 0;
		
		while(factor <= 500){
			factor = divisor(size);
			iteration++;
			size += iteration;
		}
		
		System.out.println(size-iteration);
	}
	
	
	public static void main(String[] args){
		TriangularNumber triangular = new TriangularNumber();
		triangular.calculate();
		
		
		
	}
	
}
