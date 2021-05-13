package ro.ase.csie.cts.laboratory.command;

public class UpdateModule implements GameModuleInterface {

	@Override
	public void doTheTask(String details) {
		System.out.println("Updating to version "+details);
	}

}
