package hammingDistance461;

public class HammingDistance {

	public static int hammingDistance(int x, int y) {
		int hamValue = 0;
		int bitValue = 1;
		do {
			if ((x & bitValue) != (y & bitValue)) {
				hamValue++;
			}
			bitValue *= 2;

		} while (x >= bitValue || y >= bitValue);
		return hamValue;
	}

	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
		System.out.println(hammingDistance(0, 8));
		System.out.println(hammingDistance(0, 0));
		System.out.println(hammingDistance(235245234, 95476923));
	}
}
