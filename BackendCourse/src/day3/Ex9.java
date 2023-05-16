package day3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~DECIMAL to BINARY conveter~");
		
		System.out.println("Type in a whole number:");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int nCopy = n;
		ArrayList<Integer> nBinary = new ArrayList<Integer>();
		while(true) {
			if(nCopy == 0) {
				nBinary.add(0);
				break;
			}
			if(nCopy == 1) {
				nBinary.add(1);
				break;
			}
			
			int aux = nCopy%2;
		
			nBinary.add(aux);
			
			nCopy /= 2;
		}
		
		String nBinaryString = "";
		
		for(int i = nBinary.size()-1; i >= 0; i--) {
			nBinaryString = nBinaryString.concat(String.valueOf(nBinary.get(i)));
		}
		
		System.out.println("--> "+nBinaryString);
		
		scanner.close();
	}

}
