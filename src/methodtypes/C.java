package methodtypes;

//Argument with no returntype
public class C {
	public void add(int a,int b)
	{
		int c=a+b;
	    System.out.println(c);
	}

	public static void main(String[] args) {
		C obj = new C();
		obj.add(5,5);
	

	}

}