package ro.ase.csie.cts.laboratory.facade;

public class Login {
	
	String username;
	String password;
	
	public Login(String username, String password) {
		this.username = username; 
		this.password = password;
	}
	
	public void login() {
		
	}
	
	public UserProfile getUserProfile() {
		return new UserProfile();
	}

}
