package ro.ase.csie.cts.laboratory.facade;

public class UserAPIFacade {
	
	//the facade method
	public static String getUserProfile(String username, String password) {
		GameServer server = new GameServer();
		server.connect();
		
		Login login = new Login("Player1", "1234");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		return userProfile.getProfile();
	}

}
