import java.util.*;

class Prg5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your password: ");
		String pass = sc.nextLine();
		sc.close();

		int l = pass.length();

		if (l < 8) {
			System.out.println("Password is less than 8 characters.");
		} else if (l <= 12) {
			System.out.println("Password is acceptable.");
		} else {
			System.out.println("Password is strong.");
		}
	}
}
