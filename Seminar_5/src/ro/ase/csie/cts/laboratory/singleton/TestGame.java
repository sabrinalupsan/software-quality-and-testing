package ro.ase.csie.cts.laboratory.singleton;

public class TestGame {

	public static void main(String[] args)
	{
		UIModule module = new UIModule();
		PlayerModule playerModule = new PlayerModule();
		
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
