package Problem2;

import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] fib = new int[3];
		
		fib[0] = 1;
		fib[1] = 2;
		int sum = 0;
		boolean check = true;
		
		do{
			
			fib[2] = fib[0] + fib[1];
			sum = fib[2];
			if (!check) {
				fib[1] = fib[2];
				check = true;
			} else {
				fib[0] = fib[2];
				check = false;
			}
			if(fib[2] % 2 == 0){
				list.add(fib[2]);
			}
			System.out.print(fib[2] + " ");
			
		}while(sum < 3000000);
		System.out.println();
		for(int c = 0; c< list.size(); c++){
			System.out.print(list.get(c) + " ");
		}
		int evenSum = 0;
		for(int i = 0; i < list.size(); i++){
			evenSum = evenSum + list.get(i);
		}
		System.out.println();
		System.out.println("Summan av de jŠmna fibonacci talen under 4 miljoner Šr: " + (evenSum+2));

	}
}
