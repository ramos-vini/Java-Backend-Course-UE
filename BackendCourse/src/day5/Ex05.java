package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println(getFibonacci(10));
		// System.out.println(F1(10));
	}

	static ArrayList<Integer> getFibonacci(int n) {

		ArrayList<Integer> fibonacci = new ArrayList<Integer>(Arrays.asList(0, 1));

		if (n < 2) {
			fibonacci.remove(fibonacci.size() - 1);
			return fibonacci;
		}

		for (int i = 1; i < n-1; i++) {
			fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
		}

		return fibonacci;
	}
	
	/*
	public static long F1(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return F1(n-1) + F1(n-2);
	}
	*/

}
