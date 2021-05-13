package ro.ase.csie.cts.laboratory.command;

public class AsyncTask implements AsyncTaskInterface {
	
	GameModuleInterface module;
	String actionDetails;
	int priority;

	public AsyncTask(GameModuleInterface module, String actionDetails, int priority) {
		super();
		this.actionDetails = actionDetails;
		this.module = module;
		this.priority = priority;
	}

	@Override
	public void startTask() {
		this.module.doTheTask(actionDetails);
	}

}