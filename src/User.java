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
		return "Je m'appelle " + this.name + ", j'ai " + this.age + " ans et je suis une " + this.sex + "\n";
	}
}
