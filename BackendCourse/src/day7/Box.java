package day7;

public class Box extends Solid{
	
	Box(double side1, double side2, double height){
		this.setHeight(height);
		this.setBase(side1, side2);
		this.setVolume(this.base, height);
	}

	void setBase(double side1, double side2) {
		this.base = side1 * side2;
	}
}