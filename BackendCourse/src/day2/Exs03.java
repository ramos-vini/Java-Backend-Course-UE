package day2;

public class Exs03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1 = (int)(1 + Math.random()*6);
		int dice2 = (int)(1 + Math.random()*6);
		
		int diceRoller = dice1+dice2;
		
		System.out.println(diceRoller);
	}

}
