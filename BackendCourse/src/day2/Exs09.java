package day2;
import java.util.Scanner;

public class Exs09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type in n1:");
		int n1 = scanner.nextInt();
		
		System.out.println("Type in n2:");
		int n2 = scanner.nextInt();
		
		n1 = n1+n2;
		
		n2 = n1-n2;
		
		n1 = n1-n2;
		
		System.out.println("Swapped numbers:");
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		
		scanner.close();
	}

}
