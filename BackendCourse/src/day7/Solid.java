package day7;

public abstract class Solid {
	
	protected double base;
	protected double height;
	protected double volume;
	
	// base
	public double getBase() {
		return base;
	}
	
	// height
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// volume
	public double getVolume() {
		return volume;
	}
	public void setVolume(double base, double height) {
		this.volume = base * height;
	}
}
