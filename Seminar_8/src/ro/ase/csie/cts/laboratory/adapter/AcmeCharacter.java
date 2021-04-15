package ro.ase.csie.cts.laboratory.adapter;

public abstract class AcmeCharacter {
	
	protected String name; 
	protected int lifePoints;
	
	public AcmeCharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	public String getName() {
		return name;
	}

	public int getLifePoints() {
		return lifePoints;
	}
	
	public abstract void move();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);

}
