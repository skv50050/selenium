// Enter the no. and check no is even or odd
package loop; 
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner obj = new Scanner(System.in);
		int i = obj.nextInt();
	
		if(i%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		

	}

}
