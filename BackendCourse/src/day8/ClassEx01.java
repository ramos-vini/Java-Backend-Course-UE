package day8;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intSize1 = 4;
		int intSize2 = 5;
		
		double doubleSize1 = 4.0;
		double doubleSize2 = 5.0;
		
		System.out.println("The area of the rectangular (int) is: " + Surface.calcArea(intSize1, intSize2));
		System.out.println("The area of the rectangular (double) is: " + Surface.calcArea(doubleSize1, doubleSize2));
		System.out.println();
		System.out.println("The area of the square (int) is: " + Surface.calcArea(intSize1));
		System.out.println("The area of the square (double) is: " + Surface.calcArea(doubleSize1));
	}

}
