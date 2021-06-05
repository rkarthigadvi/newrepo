package trainPack;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Arithmetic Calculator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
		int c = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		System.out.println(c-d);
		int e = Integer.parseInt(args[0]);
		int f = Integer.parseInt(args[1]);
		System.out.println(e*f);
		int g = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		System.out.println(g/h);
	}

}
