import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class User {

	// Declaration des attributs

	String name;
	Integer age;
	boolean isMale;
	String sex;

	// Constructeur

	public User(String name, Integer age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String toString() {
		if (this.isMale == true)
			this.sex = "homme";

		else
			this.sex = "femme";
		return "Je m'appelle " + this.name + ", j'ai " + this.age + " ans et je suis une " + this.sex+ "\n";
	}

	public static void main(String[] args) {
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

		// Classement par ordre alphabétique des noms

		Collections.sort(users, new Comparator<User>() {

			public int compare(User u1, User u2) {

				return u1.name.compareTo(u2.name);
			}

		});

		// Suppression de u4

		users.remove(users.indexOf(u4));

		// Affichage de l'ArrayList avec l'Iterator

		Iterator<User> iter = users.iterator();
		System.out.println(users);

	}

}

