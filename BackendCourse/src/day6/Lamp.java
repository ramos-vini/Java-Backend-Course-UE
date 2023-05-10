package day6;

public class Lamp {
	
	String name;
	
	boolean status;
	
	public void switchStatus() {
		status = !status;
	}
	
	public void showStatus() {
		if(status) {
			System.out.println("The "+name+" is ON.");
		} else {
			System.out.println("The "+name+" is OFF.");
		}

	}
}
