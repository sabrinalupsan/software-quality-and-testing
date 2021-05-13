package ro.ase.csie.cts.laboratory.command;

public class TestCommand {
	
	public static void main(String[] args) {
		TaskManager manager = new TaskManager("Background tasks");
		manager.addAsyncTask(new AsyncTask(new AutoSaveModule(5), 
				"Finishing current level", 0));
		manager.addAsyncTask(new AsyncTask(new UpdateModule(), "10.5", 0));
		
		manager.doNextTask();
		manager.doNextTask();
	}

}
