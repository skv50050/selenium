package Strings;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		String rev="";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1 = obj.nextLine();
		System.out.println("Enter second string:");
		String s2 = obj.nextLine();
		String s3 = s1.concat(s2);
		System.out.println("Concatenation of two string:="+s3);
		String s4 = s3.toUpperCase();
		int l = s4.length();
		System.out.println("uppper case of concatenation of two string:="+s4);
		System.out.println("total length of both string:="+l);
		for(int i=l-1;i>=0;i--) 
			 rev = rev+s4.charAt(i);
		 System.out.println(rev);
		 

	}

}
