package ro.ase.csie.cts.laboratory.command;

import java.util.ArrayList;

public class TaskManager {
	
	ArrayList<AsyncTaskInterface> tasks = new ArrayList<AsyncTaskInterface>();
	String name;
	
	public TaskManager(String name) {
		super();
		this.name = name;
	}
	
	public void addAsyncTask(AsyncTaskInterface task) {
		this.tasks.add(task);
	}
	
	public void doNextTask() {
		//determine the task with the highest priority
		//Round-Robin approach
		if(tasks.size()>0) {
			AsyncTaskInterface task = tasks.get(0);
			task.startTask();
			tasks.remove(0);
		}
			
	}
	
	

}
