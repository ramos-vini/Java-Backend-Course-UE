package day5;

public class CubicBox {

	static double calcSurface(double length) {
		
		return length * length;
	}
	
	static double calcVolume(double length, double height){
		
		return calcSurface(length) * height;
	}
	
}
