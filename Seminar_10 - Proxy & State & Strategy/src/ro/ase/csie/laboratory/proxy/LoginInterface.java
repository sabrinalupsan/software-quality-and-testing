package ro.ase.csie.laboratory.proxy;

public interface LoginInterface {
	
	public boolean login(String username, String password);
	public boolean checkServerStatus();

}
