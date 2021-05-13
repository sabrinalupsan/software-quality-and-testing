package ro.ase.csie.cts.laboratory.chain;

public class FilterModule extends GenericMessageHandler {

	String language;
	String[] forbiddenWords = new String[] {"kill", "hate", "violent"};
	
	public FilterModule(String language) {
		super();
		this.language = language;
	}

	@Override
	public void processMessage(Message message) {
		boolean isOk = true;
		for(String s : forbiddenWords)
			if(message.text.toLowerCase().contains(s)) {
				isOk = false;
				break;
			}
		
		if(isOk==true) {
			if(this.next!=null) {
				this.next.processMessage(message);
			}
		}
	}

}
