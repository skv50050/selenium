package typesofvariable;

public class Variable {
		int a=5;
		static int d= 7;
		
	public static void main(String[] args) {
	 Variable obj = new Variable();
		int b=6; 
		int c=9;
		int e;
		e = (obj.a + b + c)/d;
		System.out.println(e);
		
		

	}

}
