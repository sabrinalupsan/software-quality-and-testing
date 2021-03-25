package ro.ase.csie.cts.laboratory.singleton;

public class RESTBackend {
	String url;
	String data;
	
	private static RESTBackend theBackend = null;
	
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	public void sendGET()
	{
		System.out.println("Send GET command to: "+this.url);
	}
	
	public static synchronized RESTBackend getRESTBackend()
	{
		if(theBackend == null)
		{
			//get the data from a file normally
			String url = "acs.ase.ro/game";
			String data = "get user profile";
			theBackend = new RESTBackend(url, data);
		}
		return theBackend;
	}
}
