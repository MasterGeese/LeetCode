package hammingDistance461;

public class HammingDistance {
	public static void output(int x, int y) {
		System.out.println(2^3);
	}
	public static int hammingDistance(int x, int y) {
        int hamValue = 0;
        int bitValue = 1;
        do {
        	bitValue *= 2;
            if ((x % bitValue == 0) != (y % bitValue == 0)){
                hamValue++;
            }
            
            
        } while (x >= bitValue || y >= bitValue);
        return hamValue;
    }
	public static void main(String[] args) {
		output(1, 4);
		output(0, 8);
		output(0, 0);
		output(235245234, 95476923);
	}
}
