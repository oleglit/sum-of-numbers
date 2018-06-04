package info.study;

public class AppRunner2 {

	public static void main(String[] args) {
	
		int i = 12345;
		
		int sum = 0;
		
		while(i != 0){
			
			sum += (i % 10);
		        
			i/=10;
		}
		System.out.println(sum);
	}

}
