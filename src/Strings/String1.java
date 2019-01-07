package Strings;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter two name:");
		String s1 = obj.nextLine();
		String s2 = obj.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		String s3 = s1.concat(s2);
		System.out.println("Concatenation of s1 and s2 are ="+s3);
		System.out.println("Length of String is"+s3.length());
		System.out.println("Length of String is"+s3.toLowerCase());
		System.out.println("Length of String is"+s3.toUpperCase());
		 String s4 = s3.toUpperCase();
		 System.out.println(s4);
		 
		
		
		
		
		
		

	}

}
