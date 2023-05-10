package day3;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose a whole number between 1-100 to be compared with a random number.");
		
		int n = 0;
		int random;
		
		while(true) {
			try {
				n = Integer.parseInt(scanner.nextLine());
				break;
			} catch (Exception e){
				System.out.println(e);
				System.out.println("Insert a valid whole number between 1-100:");
			}
		}
		random = (int)Math.round(Math.random()*100);
		
		System.out.println("Chosen number: "+n);
		System.out.println("Random number: "+random+"\n");
		
		if(n > random) {
			System.out.println("Your number is greater than the Random one.");
		} else if(n == random) {
			System.out.println("Your number equals the Random one :O");
		} else {
			System.out.println("Your number is smaller than the Random one.");
		}
		
		scanner.close();
	}

}
