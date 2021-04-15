package ro.ase.csie.cts.laboratory.adapter;

public class FantasyCharacter extends AcmeCharacter {

	public FantasyCharacter(String name, int lifePoints) {
		super(name, lifePoints);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving", name));
	}

	@Override
	public void takeAHit(int points) {
		this.lifePoints -= points;
		System.out.println(String.format("%s took a hit of %d points", name, points));		
	}

	@Override
	public void heal(int points) {
		this.lifePoints += points;
		System.out.println(String.format("%s heals %d points", name, points));
		
	}

}
