package day7;

public class Pentagon extends Solid{
	
	Pentagon(double side, double radius, double height){
		this.setHeight(height);
		this.setBase(side, radius);
		this.setVolume(this.base, height);
	}
	
	void setBase(double side, double radius) {
		this.base = 5 * side * radius / 2;
	}
}
