package ro.ase.csie.cts.laboratory.singleton;

public class PlayerModule {

	public PlayerModule()
	{
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
