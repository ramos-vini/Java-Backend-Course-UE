package day3;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gamblers Program! You win 50% more of what you have bet or you lose it.\nType in your stake ($):");
		int stake = scanner.nextInt();
		int goal = (int) (stake*1.5);
		System.out.println("Your goal is to receive $ "+goal+".00. Let's go!");
		
		int ammount = stake;
		
		while(ammount > 0 && ammount < goal) {
			//int aux = Math.round(Math.random());
			
			System.out.print(ammount+" -> ");
			//ammount += aux;
			System.out.println(ammount+" ");
		}
		
		scanner.close();
	}

}
