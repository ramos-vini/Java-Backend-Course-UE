package day4;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,3,5,7,9};
		
		int n = 5;
		boolean includesN = false;
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] == n) {
				System.out.println("The index of '"+n+"' is "+i);
				includesN = true;
			}
		}
		
		if(!includesN) {
			System.out.println("The array does not include the number "+n);
		}
	}

}
