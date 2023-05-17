package day3;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gambling Game! You win 50% more of what you have bet or you lose it all.\nType in your stake ($):");
		int stake = scanner.nextInt();
		int goal = (int)(stake*1.5);
		System.out.println("Your goal is to receive $ " + goal + ".00. Let's go!");
		
		int sum = stake;
		
		while(sum > 0 && sum < goal) {
			int aux = (int)Math.round(Math.random());
			if(aux == 0) {
				aux = -1;
			}
			System.out.print(sum + (aux==1 ? " (+1$) " : " (-1$) "));
			sum += aux;
			System.out.println("-> " + sum);
		}
		
		System.out.println("\nFINAL REWARD: $ "+sum+".00\n");
		
		if(sum != 0) {
			System.out.println("Yess!! You did it, time to go to Vegas!! :)");
		} else {
			System.out.println("Yeah, sometimes gambling is not the best idea...");
		}
		
		
		scanner.close();
	}

}
