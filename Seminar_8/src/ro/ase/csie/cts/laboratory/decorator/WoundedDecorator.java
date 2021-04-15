package ro.ase.csie.cts.laboratory.decorator;

import ro.ase.csie.cts.laboratory.adapter.AcmeCharacter;

public class WoundedDecorator extends AcmeAbstractDecorator {
	
	public final static int MIN_POINTS = 200;

	public WoundedDecorator(AcmeCharacter character) {
		super(character);
	}

	@Override
	public void move() {
		if(this.character.getLifePoints() > MIN_POINTS)
			this.character.move();
		else
			System.out.println("You can't move");
	}

}
