package day7;

import java.util.ArrayList;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	
	User(String firstName, String lastName, int age){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}
	
	// firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// printing Users
	static void printUser(ArrayList<User> users) {
		for (User user : users) {
			System.out.println("First Name: "+user.getFirstName()+"\nLast Name: "+user.getLastName()+"\nAge: "+user.getAge()+"\n");
		}
	}
	
	// printing Users by fetching the lastName
	static void printUserByLastName(ArrayList<User> users, String string) {
		for (User user : users) {
			if(user.getLastName().startsWith(string)) {
				System.out.println("First Name: "+user.getFirstName()+"\nLast Name: "+user.getLastName()+"\nAge: "+user.getAge()+"\n");
			}
		}
	}
	
}
