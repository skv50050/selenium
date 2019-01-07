package exceptionhandling;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two No:");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = a/b ;
		System.out.println(c);

	}

}
