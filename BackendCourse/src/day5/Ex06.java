package day5;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// TODO: Tower of Hanoi using Recursion
		
		ArrayList<String> discs = new ArrayList<String>(Arrays.asList
				(
						"---------------",
						" ------------- ",
						"  -----------  ",
						"   ---------   ",
						"    -------    ",
						"     -----     ",
						"      ---      ",
						"       -       "
				)
				);
		
		ArrayList<ArrayList<String>> pegs = new ArrayList<ArrayList<String>>();
		pegs.add(discs);
		
		for(ArrayList<String> peg : pegs) {
			
			System.out.println(peg);
			System.out.println("###############\n");
		}
	}

}
