import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//Creation du premier arraylist
		ArrayList<User> users = new ArrayList();

		User u = new User("Robert", 17, true);
		users.add(u);
		User u1 = new User("Stephane", 43, true);
		users.add(u1);
		User u2 = new User("Delphine", 23, false);
		users.add(u2);
		User u3 = new User("Farid", 27, true);
		users.add(u3);
		User u4 = new User("Helene", 22, false);
		users.add(u4);
		User u5 = new User("Apolline", 85, false);
		users.add(u5);
		User u6 = new User("Sylvie", 14, false);
		users.add(u6);
		
		
		//Creation du second arraylist
		ArrayList<User> users2 = new ArrayList();

		User us = new User("Timothée", 17, true);
		users2.add(us);
		User us1 = new User("Sylvain", 43, true);
		users2.add(us1);
		User us2 = new User("Roberta", 23, false);
		users2.add(us2);
		User us3 = new User("Loic", 27, true);
		users2.add(us3);
		User us4 = new User("Claire", 22, false);
		users2.add(us4);
		User us5 = new User("Audrey", 85, false);
		users2.add(us5);
		User us6 = new User("Jeanne", 14, false);
		users2.add(us6);

		//Concatenation des deux arraylists
		users2.addAll(users);

		//Tri par ordre alphabétique
		Collections.sort(users2, new Comparator<User>() {

			public int compare(User u1, User u2) {

				return u1.name.compareTo(u2.name);
			}

		});
		
		//Suppression de u4
		users.remove(users.indexOf(u4));

		// Affichage de l'ArrayList avec l'Iterator
		
		Iterator<User> iter = users.iterator();
		System.out.println(users2);
		
		
	
	

	}

}



