import java.util.*;

public class Prg1 {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n != 0) {
			if (n > 0) {
				System.out.println("Positive number");
			} else {
				System.out.println("Negative number");
			}
			if (n % 2 == 0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}
		} else {
			System.out.println("Zero");
		}
	}
}
