package day3;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter 3 whole numbers:");
		System.out.println("1st:");
		a = scanner.nextInt();
		
		System.out.println("2nd:");
		b = scanner.nextInt();
		
		System.out.println("3rd:");
		c = scanner.nextInt();
		
		int max = Math.max(a, b);
		max = Math.max(max, c);
		
		System.out.printf("The greater number among '%d', '%d' and '%d' is: '%d'.", a, b, c, max);
		
		scanner.close();
	}

}
