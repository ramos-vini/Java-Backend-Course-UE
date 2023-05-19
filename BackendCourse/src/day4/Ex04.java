package day4;
import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[4][3];
		int[][] b = new int[3][2];
		int[][] c = new int[2][3];

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
				b[i][j] = random.nextInt(10);
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		System.out.println("Array C:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] * b[j][i];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");

	}

}
