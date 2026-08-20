import java.util.*;

class Prg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if (a >= b && a >= c) {
			System.out.println("Largest = " + a);
		} else if (b >= a && b >= c) {
			System.out.println("Largest = " + b);
		} else {
			System.out.println("Largest = " + c);
		}
	}
}
