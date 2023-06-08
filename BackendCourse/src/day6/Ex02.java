package day6;

public class Ex02 {

	public static void main(String[] args) {
		Dog doggy = new Dog(400, 15);
		Cat catty = new Cat(100, 10);
		Bird birdy = new Bird(50, 5);
		
		System.out.printf("The Dog was sold for: $ %.2f\n\n", doggy.getSalePrice());
		System.out.printf("The Cat was sold for: $ %.2f\n\n", catty.getSalePrice());
		System.out.printf("The Bird was sold for: $ %.2f\n\n", birdy.getSalePrice());
	}

}
