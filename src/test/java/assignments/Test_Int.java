package assignments;

import java.util.Scanner;

public class Test_Int {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result;
		do {
			System.out.println("Enter value bw 1-20");
			result = in.nextInt();
		} while (result < 0 || result > 20);

		System.out.println("correct " + result);

	}

}