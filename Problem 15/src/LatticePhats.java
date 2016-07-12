
public class LatticePhats {
	public static void main(String[] args){
		int size = 20;
		long way = 1;
		
		for(int i = 0; i < size; i++){
			way *= (2 * size) - i;
			way /= i + 1;
		}
		
		
		
		System.out.println(way);
	}
}
