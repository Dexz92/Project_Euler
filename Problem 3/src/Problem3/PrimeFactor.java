package Problem3;


public class PrimeFactor {
	public static void main(String[] args){
		long tal = 600851475143L;
			for(long divisor = 2; divisor <=tal ; divisor ++){
				if(tal % divisor == 0){
					System.out.print(divisor + " ");
					tal = tal / divisor;
					divisor = 2;
				}
			}
	}
}