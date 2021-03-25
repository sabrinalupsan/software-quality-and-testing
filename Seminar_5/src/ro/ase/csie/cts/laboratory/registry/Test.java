package ro.ase.csie.cts.laboratory.registry;

public class Test {

	public static void main(String[] args) {
		RESTBackend backend1 = RESTBackend.getRESTBackend("10.0.0.1", "test");
		RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.1", "test");
		RESTBackend backend3 = RESTBackend.getRESTBackend("10.0.0.2", "test2");
		
		if(backend1==backend2)
			System.out.println("Successful");
		if(backend1!=backend3)
			System.out.println("Successful");
	}

}
