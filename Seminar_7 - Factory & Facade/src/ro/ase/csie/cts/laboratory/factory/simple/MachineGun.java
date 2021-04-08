package ro.ase.csie.cts.laboratory.factory.simple;

public class MachineGun extends AbstractWeapon {

	public MachineGun(String colour) {
		super(colour, 500);
	}

	@Override
	public void pewPew() {
		System.out.println("-> -> ->");
	}

}
