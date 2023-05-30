package day5;

public class StdStats {
	// Methods: max, min, mean, var, stddev
	
	static double max(double[] numbers) {
			
		double max = numbers[0];
		
		for (double n : numbers) {
			if(n > max) {
				max = n;
			}
		}
		
		return max;
	}
	
	static double min(double[] numbers) {
		
		double min = numbers[0];
		
		for (double n : numbers) {
			if(n < min) {
				min = n;
			}
		}
		
		return min;
	}
	
	static double mean(double[] numbers) {
		
		double sum = 0;
		
		for (double n : numbers) {
			sum += n;
		}
		
		int length = numbers.length;
		
		double mean = sum/length;
		
		return mean;
	}
	
	static double var(double[] numbers) {
		
		double mean = mean(numbers);
		
		int length = numbers.length;
		
		double sum = 0;
		
		
		for (double n : numbers) {
			sum += Math.pow((n - mean), 2);
		}
		
		double var = sum / (length-1);
		
		return var;
	}
	
	static double stdDev(double[] numbers) {
		
		return Math.sqrt(var(numbers));
	}
}
