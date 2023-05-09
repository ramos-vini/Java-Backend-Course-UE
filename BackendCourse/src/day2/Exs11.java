package day2;

public class Exs11 {
	public static void main(String[] args) {
		String string1 = "<h1>This is a html h1 tag.</h1>";
		
		String string2 = string1.replaceAll("<[^>]*>", "");
		
		System.out.println(string2);
	}
}
