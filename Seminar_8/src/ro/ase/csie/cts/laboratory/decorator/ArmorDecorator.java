package ro.ase.csie.cts.laboratory.decorator;

import ro.ase.csie.cts.laboratory.adapter.AcmeCharacter;

public class ArmorDecorator extends AcmeAbstractDecorator {
	
	int armorLevel;

	public ArmorDecorator(AcmeCharacter character, int armorLevel) {
		super(character);
		this.armorLevel = armorLevel;
	}

	@Override
	public void takeAHit(int points) {
		int lostPoints = points - armorLevel;
		if(lostPoints > 0)
			this.character.takeAHit(lostPoints);
	}

}
