package day5;

public class Cylinder {
	
	static double calcSurface(double length) {
		
		double r = length/2;
		
		return Math.PI*r*r;
	}
	
	static double calcVolume(double length, double height){
		
		return calcSurface(length) * height;
	}

}
