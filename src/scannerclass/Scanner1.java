package scannerclass;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please Enter two number");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = a + b;
		System.out.println(c);

	}

}
