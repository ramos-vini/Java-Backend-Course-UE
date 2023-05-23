package day5;

public class Ex00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 43.28;

		System.out.println("True root: " + Math.sqrt(n));
		
		System.out.printf("My root: %.2f", squareRoot(n));
	}

	static double squareRoot(double n) {

		double x = 0.1;
		double root = x;
		double rest = n - (x * x);

		while (x <= n / 2) {
			x += 0.01;
			double aux = n - (x * x);
			if (Math.abs(aux) < Math.abs(rest)) {
				rest = aux;
				root = x;
			}
		}

		return root;
	}

}
