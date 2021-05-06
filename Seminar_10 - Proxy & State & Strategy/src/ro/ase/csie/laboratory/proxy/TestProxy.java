package ro.ase.csie.laboratory.proxy;

public class TestProxy {

	public static void main(String[] args) {
		LoginInterface loginModule = new LoginModule("10.0.0.1", "users");
		
		if(loginModule.login("admin",  "123admin"))
			System.out.println("Hello admin!");
		else
			System.out.println("Wrong credentials");
		
		loginModule = new LogInWith2FactorAuth(loginModule);
		
		String[] passwords = new String[] {"1234", "123456", "123admin"};
		for(String pass : passwords) {
			if(loginModule.login("admin",  pass)) {
				System.out.println("Found it! Is: " + pass);
				break;
			}
		}
	}

}
