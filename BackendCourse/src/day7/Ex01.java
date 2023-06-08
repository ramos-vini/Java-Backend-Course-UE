package day7;

public class Ex01 {

	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(5, 10);
		
		Box box = new Box(5, 5, 10);
		
		System.out.println("\n-- Cylinder --");
		System.out.printf("Base Area: %.2f\n", cylinder.getBase());
		System.out.printf("Height: %.2f\n", cylinder.getHeight());
		System.out.printf("Volume: %.2f\n", cylinder.getVolume());
		
		System.out.println("\n-- Box --");
		System.out.printf("Base Area: %.2f\n", box.getBase());
		System.out.printf("Height: %.2f\n", box.getHeight());
		System.out.printf("Volume: %.2f\n", box.getVolume());
		
		System.out.println("\n(" + (cylinder.getVolume() > box.getVolume() ? "Cylinder's" : "Boxes") + " Area is greater)\n");
	}

}
