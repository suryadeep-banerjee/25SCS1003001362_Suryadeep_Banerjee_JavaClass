public class AutoboxingDemo {

	public static void main(String[] args) {
		int number = 100;
		double decimal = 25.5;
		char letter = 'A';
		boolean flag = true;

		Integer intObj = number;
		Double doubleObj = decimal;
		Character charObj = letter;
		Boolean boolObj = flag;

		System.out.println("Integer: " + intObj);
		System.out.println("Double: " + doubleObj);
		System.out.println("Character: " + charObj);
		System.out.println("Boolean: " + boolObj);
	}
}
