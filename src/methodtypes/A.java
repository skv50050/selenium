package methodtypes;

// No argument with no return type
public class A {
	public void add()
	{
		int a=5,b=10,c=a+b;
	    System.out.println(c);
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.add();

	}

}
