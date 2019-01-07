// Print odd no. between 1 to 100
package loop;

public class Odd {

	public static void main(String[] args) {
		System.out.println("Odd numbers are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
