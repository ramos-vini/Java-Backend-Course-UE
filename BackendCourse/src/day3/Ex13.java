package day3;
import java.util.Scanner;
import java.util.Random;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No more silly passwords. Let's build a strong one for you.");
		System.out.println("What length do you want your password to have? (14-16 chars. for high security)");
		
		int passwordLength = scanner.nextInt();
		
		Random random = new Random();
		
		String ascii = "qwertyuiopasdfghjklzxcvbnm1234567890!@#$%&*-";
		
		System.out.println("Here comes your password! Don't lose it :)");
		
		for (int i = 0; i < passwordLength; i++) {
			char c = ascii.charAt(random.nextInt(ascii.length()));
			System.out.print(c);
		}
		
		scanner.close();
	}

}
