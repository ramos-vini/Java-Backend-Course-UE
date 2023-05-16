package day3;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type in a whole positive number:");
		int n = scanner.nextInt();

		ArrayList<Integer> primeList = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {

			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primeList.add(i);
			}
		}

		ArrayList<Integer> factoredList = new ArrayList<Integer>();
		int nFactored = n;
		int listIndex = 0;

		while (nFactored != 1) {
			if (nFactored % primeList.get(listIndex) == 0) {
				factoredList.add(primeList.get(listIndex));
				nFactored /= primeList.get(listIndex);
			} else {
				listIndex++;
			}
		}

		// System.out.println(primeList);

		if (primeList.contains(n)) {
			System.out.println("'" + n + "' is a prime number.");
		} else if (n == 1) {
			System.out.println("1 is only divided by itself.");
		} else {
			System.out.println("Prime Factorization of '" + n + "':");
			System.out.print(factoredList.toString().replace(", ", "*").replaceAll("[\\[\\]]", ""));
			System.out.println(" = " + n);
		}

		scanner.close();
	}

}
