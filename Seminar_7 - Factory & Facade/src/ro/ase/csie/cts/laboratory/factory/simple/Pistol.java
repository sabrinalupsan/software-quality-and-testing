package ro.ase.csie.cts.laboratory.factory.simple;

public class Pistol extends AbstractWeapon{

	public Pistol(String colour, int power) {
		super(colour, power);
	}

	@Override
	public void pewPew() {
		System.out.println("------>");
	}

}
