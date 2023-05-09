package day2;

import java.util.ArrayList;

public class Exs12 {

	public static void main(String[] args) {
		
		String fileName = "sound";
		String fileExtension = ".txt";
		
		ArrayList<String> filesArray = new ArrayList<String>();
		
		for(int i=1; i<=5; i++) {
			filesArray.add(fileName + i + fileExtension);
		}
		
		for(String file : filesArray) {
			System.out.println(file);
		}
	}

}
