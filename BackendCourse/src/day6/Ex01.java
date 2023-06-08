package day6;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamp2 lamp = new Lamp2();
		
		System.out.println("Lamp on? " + lamp.getStatus());
		
		lamp.switchStatus();
		
		System.out.println("Lamp on? " + lamp.getStatus());
	}

}
