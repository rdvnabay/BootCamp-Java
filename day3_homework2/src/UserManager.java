public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " adlı kullanıcı eklendi");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
