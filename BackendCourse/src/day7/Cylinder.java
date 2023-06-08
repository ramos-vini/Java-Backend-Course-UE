package day7;

public class Cylinder extends Solid{
	
	Cylinder(double radius, double height){
		this.setHeight(height);
		this.setBase(radius);
		this.setVolume(this.base, height);
	}
	
	void setBase(double r) {
		this.base = Math.PI*r*r;
	}

}
