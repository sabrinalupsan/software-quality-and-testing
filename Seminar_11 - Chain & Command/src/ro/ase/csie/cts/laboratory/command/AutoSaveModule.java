package ro.ase.csie.cts.laboratory.command;

public class AutoSaveModule implements GameModuleInterface {
	
	int frequency;

	public AutoSaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}

	@Override
	public void doTheTask(String details) {
		System.out.println("Autosaving for "+details);
	}
	
	

}
