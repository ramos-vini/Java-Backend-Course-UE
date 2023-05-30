package day5;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {1, 3, 4.5, 2.2, 14, 6.8, 9};
		
		System.out.println("Max: " + StdStats.max(numbers));
		System.out.println("Min: " + StdStats.min(numbers));
		System.out.println("Mean: " + StdStats.mean(numbers));
		System.out.println("Sample Variance: " + StdStats.var(numbers));
		System.out.println("Standard Deviation: " + StdStats.stdDev(numbers));
	}

}
