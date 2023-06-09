package day7;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pentagon pentagon = new Pentagon(5, 5, 10);
		
		System.out.println("-- Pentagon --");
		System.out.printf("Base Area: %.2f\n", pentagon.getBase());
		System.out.printf("Height: %.2f\n", pentagon.getHeight());
		System.out.printf("Volume: %.2f\n", pentagon.getVolume());
	}

}
