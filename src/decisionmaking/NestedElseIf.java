package decisionmaking;

public class NestedElseIf {

	public static void main(String[] args) {
		int a=5, b=6, c=7;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		
			else if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
				
		}

	}

}
