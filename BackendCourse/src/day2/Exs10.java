package day2;

public class Exs10 {
	
	public static void main(String[] args) {
		
		String string = "Vinícius";
		
		System.out.println(string.replaceAll("[^\\x00-\\x7F]", ""));

	}
}
