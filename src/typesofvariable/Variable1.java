package typesofvariable;

public class Variable1 {
	int a = 1;
	int b = 2;
	static int d = 4;
	static int e = 5;

	public static void main(String[] args) {

		int g;
		int c = 3;
		int f = 6;
		Variable1 obj = new Variable1();
		g = (obj.a + obj.b + d + c) / (e + f);

		System.out.println(g);
	}

}
