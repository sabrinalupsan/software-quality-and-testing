package ro.ase.csie.cts.laboratory.chain;

public class TestChain {
	
	public static void main(String[] args) {
		GenericMessageHandler filterModule = new FilterModule("English");
		GenericMessageHandler privateModule = new PrivateMessageModule();
		GenericMessageHandler groupModule = new GroupMessageModule();
		
		filterModule.setNext(privateModule);
		privateModule.setNext(groupModule);
		
		GenericMessageHandler chatServer = filterModule;
		chatServer.processMessage(new Message("Hello john", "@john", 1));
		chatServer.processMessage(new Message("kill", "@john", 1));
		chatServer.processMessage(new Message("Let's join the party", "@everyone", 1));

	}

}
