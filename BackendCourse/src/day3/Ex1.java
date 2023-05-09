package day3;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		while(n < 1 || n > 7) {
			System.out.println("Enter a whole number between 1-7.");

			n = scanner.nextInt();
		}
		
		switch (n) {
		case 1:
			System.out.println("Monday >:(");
			break;
		case 2:
			System.out.println("Tuesday :(");
			break;
		case 3:
			System.out.println("Wednesday :(");
			break;
		case 4:
			System.out.println("Thursday :|");
			break;
		case 5:
			System.out.println("Friday :)");
			break;
		case 6:
			System.out.println("Saturday xD");
			break;
		case 7:
			System.out.println("Sunday :)");
			break;	

		default:
			break;
		}
		
		scanner.close();
	}

}
