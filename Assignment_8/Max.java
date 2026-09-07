public class Max {

	int max(int a, int b) {
		return a > b ? a : b;
	}

	int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	double max(double a, double b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		Max m = new Max();

		System.out.println("Maximum of two integers: " + m.max(10, 20));
		System.out.println("Maximum of three integers: " + m.max(10, 50, 30));
		System.out.println("Maximum of two decimal numbers: " + m.max(25.5, 20.8));
	}
}
