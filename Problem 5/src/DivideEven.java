
public class DivideEven {
	public static void main(String[] args){
		int startNumber = 1;
		int checkNumber = 1;
	
		int counter = 0;
		while(counter < 20){
			for(startNumber = 1; startNumber <= 20; startNumber++){
				if(checkNumber % startNumber == 0){
					counter = counter + 1;
				}
			}
			if(counter == 20){
				break;
			}else{
				checkNumber = checkNumber + 1;
				counter = 0;
			}
		}
		System.out.println(checkNumber);
	}
}
