package day2;
import java.util.Scanner;

public class Exs05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose a max number starting from 0 to generate another random one.");
		
		int n =  scanner.nextInt();
		
		int random = (int)Math.round(Math.random()*n);
		
		System.out.println("The random number is: "+random);
		
		scanner.close();
	}

}
