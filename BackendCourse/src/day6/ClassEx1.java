package day6;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamp lamp1 = new Lamp();
		lamp1.name = "Lamp 1";
		lamp1.status = true;
		
		Lamp lamp2 = new Lamp();
		lamp2.name = "Lamp 2";
		lamp2.status = false;
		
		lamp1.showStatus();
		lamp2.showStatus();
		
		System.out.println("\nNow let's switch them:\n");
		
		lamp1.switchStatus();
		lamp2.switchStatus();
		
		lamp1.showStatus();
		lamp2.showStatus();
		
	}

}
