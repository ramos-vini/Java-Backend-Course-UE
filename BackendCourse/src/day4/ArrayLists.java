package day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// Generic Type List<>
		List myList = new ArrayList();
		
		myList.add(9);
		myList.add(9.9);
		myList.add(7.9);
		myList.add("9");
		myList.add("Name");
		myList.add('G');
		myList.add(true);
		myList.add(false);
		System.out.println(myList);
		
		myList.add(7);
		System.out.println(myList);
		
		myList.remove(6);
		System.out.println(myList);
		
		myList.add(0, "First");
		System.out.println(myList);
		
		System.out.println(myList.get(0));
		
		myList.clear();
		System.out.println(myList);
	}

}
