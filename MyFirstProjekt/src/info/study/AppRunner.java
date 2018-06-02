package info.study;

public class AppRunner {

	public static void main(String[] args) {

		int i = 12345;
		int sum = 0;
		int number;
		
		number = i % 10;
		sum = sum + number;
		
		i = i / 10;
		
		number = i % 10;
		sum = sum + number;
		
		i = i / 10;number = i % 10;
		sum = sum + number;
		
		i = i / 10;number = i % 10;
		sum = sum + number;
		
		i = i / 10;
		
		sum = sum + i;
		
		System.out.println(sum);
	}

}
