public class PrimitiveWrapper {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 100;
		long l = 1000L;
		float f = 10.5f;
		double d = 20.5;
		char c = 'A';
		boolean bool = true;

		Byte wb = b;
		Short ws = s;
		Integer wi = i;
		Long wl = l;
		Float wf = f;
		Double wd = d;
		Character wc = c;
		Boolean wbool = bool;

		System.out.println("Primitive byte: " + b);
		System.out.println("Wrapper Byte: " + wb);

		System.out.println("Primitive short: " + s);
		System.out.println("Wrapper Short: " + ws);

		System.out.println("Primitive int: " + i);
		System.out.println("Wrapper Integer: " + wi);

		System.out.println("Primitive long: " + l);
		System.out.println("Wrapper Long: " + wl);

		System.out.println("Primitive float: " + f);
		System.out.println("Wrapper Float: " + wf);

		System.out.println("Primitive double: " + d);
		System.out.println("Wrapper Double: " + wd);

		System.out.println("Primitive char: " + c);
		System.out.println("Wrapper Character: " + wc);

		System.out.println("Primitive boolean: " + bool);
		System.out.println("Wrapper Boolean: " + wbool);
	}
}
