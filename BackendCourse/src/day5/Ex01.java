package day5;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 5.0;
		double height = 7.5;
		
		double cylinderVol = Cylinder.calcVolume(length, height);
		double cubicBoxVol = CubicBox.calcVolume(length, height);
		
		System.out.printf("Length: %.2f\nHeight: %.2f\n\n", length, height);
		
		System.out.printf("Cylinder Volume: %.2f\nCubic Box Volume: %.2f\n\n", cylinderVol, cubicBoxVol);
		
		System.out.println((cylinderVol > cubicBoxVol ? "Cylinder's" : "Cubic Box's") + " Volume is greater.");
	}

}
