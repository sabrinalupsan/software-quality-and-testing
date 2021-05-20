package ro.ase.csie.cts.laboratory.observer;

import java.util.ArrayList;

public class ServerConnectionModule {
	
	ArrayList<ConnectionStatusInterface> modules = new ArrayList<ConnectionStatusInterface>();
	
	public void register(ConnectionStatusInterface module) {
		this.modules.add(module);
	}
	
	public void unregister(ConnectionStatusInterface module) {
		this.modules.remove(module);
	}
	
	public void detectConnectionStatusChange(ConnectionStatus status) {
		if(status == ConnectionStatus.DOWN)
			for(ConnectionStatusInterface module : modules)
				module.connectionDown();
		else
			for(ConnectionStatusInterface module : modules)
				module.connectionUp();
	}

}
