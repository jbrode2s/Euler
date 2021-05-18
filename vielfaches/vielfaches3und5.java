package vielfaches;

public class vielfaches3und5 {

	public static int vielfaches() {
		int summe = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				summe += i;
			}
		}
		return summe;
	}

	public static void main(String[] args) {
		System.out.println(vielfaches());
	}

}
