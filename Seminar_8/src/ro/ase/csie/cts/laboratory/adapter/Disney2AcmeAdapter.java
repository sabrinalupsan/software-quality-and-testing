package ro.ase.csie.cts.laboratory.adapter;

public class Disney2AcmeAdapter extends AcmeCharacter {
	
	DisneyActions disneyCharacter = null;

	public Disney2AcmeAdapter(DisneyActions disneyC) {
		super(disneyC.getName(), disneyC.getPowerLevel());
		this.disneyCharacter = disneyC;
	}

	@Override
	public void move() {
		this.disneyCharacter.changeLocation(0,  0);
	}

	@Override
	public void takeAHit(int points) {
		this.disneyCharacter.losePower(points);
	}

	@Override
	public void heal(int points) {
		this.disneyCharacter.recoverPower(points);
	}
	

}
