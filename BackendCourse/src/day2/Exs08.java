package day2;
import java.util.Scanner;

public class Exs08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Type in n1:");
		int n1 = scanner.nextInt();
		
		System.out.println("Type in n2:");
		int n2 = scanner.nextInt();
		
		int swapAux = n1;
		n1 = n2;
		n2 = swapAux;
		
		System.out.println("\nSwapped numbers:");
		System.out.println("n1: "+n1+"\nn2: "+n2);
		
		scanner.close();
	}

}
