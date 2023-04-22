package day2;
import java.util.Scanner;

public class Exs07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let's find out the perimeter of a circle. Type in its radius value.");
		
		double r = scanner.nextDouble();
		
		System.out.println("The circle perimeter is: "+2*Math.PI*r);
		
	}

}
