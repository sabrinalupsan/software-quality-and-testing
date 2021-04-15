package ro.ase.csie.cts.laboratory.decorator;

import ro.ase.csie.cts.laboratory.adapter.AcmeCharacter;
import ro.ase.csie.cts.laboratory.adapter.FantasyCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		AcmeCharacter dragon = (AcmeCharacter) new FantasyCharacter("Blue dragon", 1000);
		dragon.move();
		dragon.takeAHit(700);
		dragon.heal(100);
		
		//not like this, it's misleading, looks like you have more dragons
		//AcmeCharacter dragonWithArmor = new ArmorDecorator(dragon,  200);
		//dragonWithArmor.takeAHit(300);
		
		dragon = new ArmorDecorator(dragon,  200);
		dragon.takeAHit(300);
		
		dragon = new WoundedDecorator(dragon);
		dragon.takeAHit(300);
		dragon.move();
		
		AcmeCharacter dragon2 = (AcmeCharacter) new FantasyCharacter("Yellow dragon", 800);
		dragon2.move();
		dragon2.takeAHit(30);
		dragon2.heal(20);
		
	}

}
