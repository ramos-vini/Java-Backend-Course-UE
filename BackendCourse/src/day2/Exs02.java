package day2;

public class Exs02 {
	public static void main(String[] args) {
		int a = 12;
		int b = 47;
		
		int random = (int) Math.round(a + Math.random() * (b-a));
		
		System.out.println(random);
	}
}
