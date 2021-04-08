package ro.ase.csie.cts.laboratory.facade;

public class TestFacade {
	
	public static void main(String[] args) {
		
		/*
		 * //1. Create a game server instance and connect GameServer server = new
		 * GameServer(); server.connect();
		 * 
		 * //2. Create a log in Login login = new Login("Player1", "1234");
		 * login.login();
		 * 
		 * UserProfile userProfile = login.getUserProfile(); String profile =
		 * userProfile.getProfile();
		 * System.out.println(profile);
		 */
		
		String profile2 = UserAPIFacade.getUserProfile("player2", "12345");
		System.out.println(profile2);
	}

}
