package day4;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Let's build a 2D array. Enter the number of colums/rows:");
		int n = scanner.nextInt();

		int[][] nArray = new int[n][n];

		int aux = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				aux += 10;
				nArray[i][j] = aux;
				System.out.print(nArray[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}
