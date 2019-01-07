package typesofvariable;

public class InstanceDemo {

	// Instance variable
	int a = 100;
	int b = 200;
	int c = a + b;

	public void add() {
		int d = a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		InstanceDemo obj = new InstanceDemo();
		System.out.println(obj.c);
		obj.add();

	}

}
