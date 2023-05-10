package day3;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello! How old are you?");
		int age = scanner.nextInt();
		
		String categorie;
		
		if(age < 18) {
			categorie = "Young";
		} else if(age < 40) {
			categorie = "Adult";
		} else {
			categorie = "Old";
		}
		
		System.out.println("Your age categorie is: "+categorie);
		
		scanner.close();
	}

}
