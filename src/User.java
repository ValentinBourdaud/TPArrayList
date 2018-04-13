import java.util.ArrayList;

public class User {
	
	//Declaration des attributs 
	
	String name;
	Integer age;
	boolean isMale;
	
	//Constructeur 
	
	public User() {
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<User>users = new ArrayList();
		
		User u = new User();
		users.add(u);
		
	}

}
