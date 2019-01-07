package methodtypes;
//Argument with return type
public class D {
	public int add(int a, int b)
	{
		int c=a+b;
	    return c;
	}

	public static void main(String[] args) {
		D obj = new D();
		int z = obj.add(5,5);
		System.out.println(z);

	}

}