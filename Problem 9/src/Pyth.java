
public class Pyth {
	private int a;
	private int b;
	private int c;
	private int result;
	
	public Pyth(){
		a = 0;
		b = 0;
		c = 0;
		
		result = 0;
	}
	
	public int pyth(){
		for(a = 0; a <= 1000; a++){
			for(b = a+1; b<= 1000; b++){
				for(c = b+1; c <= 1000; c++){
					if( ((a*a) + (b*b) == (c*c)) && ((a+b+c) == 1000)){
						result = a * b * c;
					}
				}
			}
		}

		return result;
	}
	
	public static void main(String[] args){
		Pyth pytho = new Pyth();
		System.out.println(pytho.pyth());
	}
}
