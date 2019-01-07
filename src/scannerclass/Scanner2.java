package scannerclass;

import java.util.*;

public class Scanner2 {
	

		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Please Enter two number");
			int a = obj.nextInt();
			int b = obj.nextInt();
			if(a>b)
			{
				System.out.println("greater is:"+a);
			}
			else
			{
				System.out.println("greater is:"+b);
			}

		}

	}




