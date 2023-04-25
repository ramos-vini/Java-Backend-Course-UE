package day4;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[] = {4.8, 8.9, -6.9, 0, 10, 0.5, -0.1, 0.09};
		
		double sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}

}
