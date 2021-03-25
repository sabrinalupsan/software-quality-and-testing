package ro.ase.csie.cts.laboratory.static_singleton;

public class RESTBackend {
	
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	private RESTBackend() {}
	static
	{
		System.out.println("Is executed when the class is loaded");
		theBackend = new RESTBackend();
		theBackend.url = "ase.csie";
	}
	{
		System.out.println("Is executed before any constructor call.");
	}

}
