// print table through user input
package loop;

import java.util.Scanner;

public class UserInputTable {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(i*n);
		}


	}

}
