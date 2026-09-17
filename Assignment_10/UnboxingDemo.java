public class UnboxingDemo {

	public static void main(String[] args) {
		Integer intObj = 100;
		Double doubleObj = 25.5;
		Character charObj = 'A';
		Boolean boolObj = true;

		int number = intObj;
		double decimal = doubleObj;
		char letter = charObj;
		boolean flag = boolObj;

		System.out.println("int: " + number);
		System.out.println("double: " + decimal);
		System.out.println("char: " + letter);
		System.out.println("boolean: " + flag);
	}
}
