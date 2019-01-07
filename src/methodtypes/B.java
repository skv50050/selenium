package methodtypes;
//No argument with return type
public class B {
	public int add()
	{
		int a=5,b=10,c=a+b;
	    return c;
	}

	public static void main(String[] args) {
		B obj = new B();
		int z = obj.add();
		System.out.println(z);

	}

}