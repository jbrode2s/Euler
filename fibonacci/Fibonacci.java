package fibonacci;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		if(n <= 2) 
			return (n > 0) ? 1 : 0;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static boolean istGerade(int i) {
		if(i % 2 == 0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 100; i++) {
			if(istGerade(fibonacci(i))== true) {
				sum += fibonacci(i);
			}
			if(sum > 4000000) {
				break;
			}
		}
		System.out.println(sum);
	}
}
