package day7;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User("Johnny", "Cash", 92);
		User user2 = new User("Carl", "Pacman", 47);
		User user3 = new User("Katy", "Perry", 35);
		User user4 = new User("Usman", "Cameron", 28);
		
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4));
		
		System.out.println("~ Users\n");
		
		User.printUser(users);
		
		System.out.println("\n~ Users whose Last Name starts with \"C\"\n");
		
		User.printUserByLastName(users, "C");
	}

}
