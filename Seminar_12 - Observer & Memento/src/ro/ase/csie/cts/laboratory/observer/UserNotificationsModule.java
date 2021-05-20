package ro.ase.csie.cts.laboratory.observer;

public class UserNotificationsModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		System.out.println("Pop-up message: connection is active");
	}

	@Override
	public void connectionDown() {
		System.out.println("Pop-up message: connection is inactive");
	}

}
