package day4;
import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] a = new int[n][n]; 
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];
		
		Random random = new Random();
		
		System.out.println("Array A:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = random.nextInt(10);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		System.out.println("Array B:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				b[i][j] = random.nextInt(10);
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		System.out.println("Array C:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j] * b[j][i];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		
	}

}
