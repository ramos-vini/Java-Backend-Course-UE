package day4;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 3;
		int[][] a = new int[n][m];
		int[][] b = new int[m][n];

		Random random = new Random();

		System.out.println("Array A:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(10);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		System.out.println("Array B:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
	}

}
