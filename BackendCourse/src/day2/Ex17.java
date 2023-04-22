package day2;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an example String";
		String[] strArray = str.split(" ");
		
		System.out.println("Array Elements:");
		
		for (String word : strArray) {
			System.out.println("- "+word);
		}
	}

}
