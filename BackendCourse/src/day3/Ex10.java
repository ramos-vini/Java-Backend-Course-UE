package day3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type in a whole positive number:");
		int n = scanner.nextInt();

		if (n == 0 || n == 1) {
			System.out.println("There are no prime numbers between 0 and " + n);
		} else {
			
			System.out.println("The prime numbers between 0 and "+n+" are:\n");

			for (int i = 2; i <= n; i++) {

				int counter = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						counter++;
						break;
					}
				}

				if (counter == 0) {
					System.out.println(i);
				}
			}

			scanner.close();
		}
	}
}
