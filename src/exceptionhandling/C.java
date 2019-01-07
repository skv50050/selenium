package exceptionhandling;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two No:");
		int a = obj.nextInt();
		int b = obj.nextInt();
		try
		{
			int c = a/b ;
			System.out.println(c);

		}
		catch(Exception e)
		{
			System.out.println("Number is not divide by zero");
			//System.out.println(e);
			//throw e;
			//throws e;
			
		}
		finally {
			System.out.println("mai toh run karunga hi");
		}
		
	}


	}


