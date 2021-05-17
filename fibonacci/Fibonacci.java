package fibonacci;

public class Fibonacci {
	
	public static long fibonacci(int n) {
		if(n == 0) 
			return 0;
		else if (n == 1) 
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static boolean istGerade(long i) {
		if(i % 2 == 0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		long summe = 0;
		for(int i = 1; i < 33; i++) {
			if(istGerade(fibonacci(i))== true) {
				summe += fibonacci(i);
			}
		}
		System.out.println(summe);
	}
}
