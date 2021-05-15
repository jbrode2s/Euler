package vielfaches;

public class vielfaches3und5 {

	private static int a = 3;
	private static int b = 5;

	public static void vielfaches(int zahl, int n) {
		int summe = 0;
		for (int i = 1; i <= n; i++) {
				summe += zahl * i;
				if(zahl*i >= 999) {
					System.out.println(summe);
					return;
				}
		}
	}

	public static void main(String[] args) {
		vielfaches(a, 1000);
		System.out.println(""
				+ "------------------");
		vielfaches(b,1000);
	}

}
