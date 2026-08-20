import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		System.out.println("Enter N :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),
			s = 0;
		sc.close();
		for (int i = 1; i <= n; i++) s += i;
		System.out.println("Sum : " + s);
	}
}
