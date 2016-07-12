public class Palindrome {
	public static void main(String[] args) {
		int value = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <=999; j++) {
				int value1 = i * j;
				StringBuilder sb = new StringBuilder(""+value1);
				String temp = ""+value1;
				sb.reverse();
				if (temp.equals(sb.toString()) && value < value1) {
					value = value1;
				}
			}
		}
		System.out.println(value);
		System.out.println("Hejsan");
	}
}
