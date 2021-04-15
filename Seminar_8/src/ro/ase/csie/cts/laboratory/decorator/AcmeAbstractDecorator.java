package ro.ase.csie.cts.laboratory.decorator;

import ro.ase.csie.cts.laboratory.adapter.AcmeCharacter;

public abstract class AcmeAbstractDecorator extends AcmeCharacter {
	
	AcmeCharacter character = null;
	
	public AcmeAbstractDecorator(AcmeCharacter character) {
		super(character.getName(), character.getLifePoints());
		this.character = character;
	}

	@Override
	public int getLifePoints() {
		// TODO Auto-generated method stub
		return this.character.getLifePoints();
	}

	@Override
	public void move() {
		this.character.move();
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
	}

}
