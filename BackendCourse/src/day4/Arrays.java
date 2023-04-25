package day4;

public class Arrays {

	public static void main(String[] args) {
		// Declare an Array
		double myArray[];
		
		// Size of Array
		myArray = new double[5];
		
		// Assigning Values
		myArray[0] = 2;
		myArray[1] = 4;
		myArray[2] = 6;
		
		System.out.println("Array 1:\n");
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		// Direct Initializing:
		double myArray2[] = {1, 2, 3};
		
		System.out.println("\nArray 2:\n");
		
		// forEach loop
		for (double number : myArray2) {
			System.out.println(number);
		}
	}

}
