package ro.ase.csie.cts.laboratory.observer;

public class TestObserver {

	public static void main(String[] args) {
		ServerConnectionModule module = new ServerConnectionModule();
		ConnectionStatusInterface backupModule = new BackupModule();
		ConnectionStatusInterface userNotificationsModule = new UserNotificationsModule();
		
		module.detectConnectionStatusChange(ConnectionStatus.DOWN);
		module.register(backupModule);
		module.register(userNotificationsModule);
		
		module.detectConnectionStatusChange(ConnectionStatus.UP);
		module.unregister(backupModule);
		module.detectConnectionStatusChange(ConnectionStatus.DOWN);
	}

}
