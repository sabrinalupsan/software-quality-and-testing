package ro.ase.csie.laboratory.proxy;

public class LogInWith2FactorAuth implements LoginInterface {
	
	LoginInterface loginModule = null;
	//you can add other attributes here specific to the proxy if you want
	
	@Override
	public boolean login(String username, String password) {
		if(this.loginModule.login(username, password)) {
			System.out.println("Please input code");
			if(checkGeneratedCode(1235)) {
				System.out.println("Hello "+username);
				return true;
			}
		}
		return false;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code == 12345) 
			return true;
		return false;
	}

	public LogInWith2FactorAuth(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}
	

}
