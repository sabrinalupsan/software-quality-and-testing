package ro.ase.csie.cts.laboratory.chain;

public abstract class GenericMessageHandler {
	
	GenericMessageHandler next = null;
	
	public abstract void processMessage(Message message);
	
	public void setNext(GenericMessageHandler next) {
		this.next = next;
	}

}
