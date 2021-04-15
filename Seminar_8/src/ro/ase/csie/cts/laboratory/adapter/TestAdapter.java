package ro.ase.csie.cts.laboratory.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {

		AcmeCharacter dragon = (AcmeCharacter) new FantasyCharacter("Blue dragon", 1000);
		dragon.move();
		dragon.takeAHit(30);
		dragon.heal(20);
		
		DisneyActions donald = new DonaldDuck("Donald Duck", 500);
		donald.changeLocation(100, 50);
		donald.losePower(150);
		donald.recoverPower(100);
		
		ArrayList<AcmeCharacter> characters = new ArrayList<AcmeCharacter>();
		characters.add(dragon);
		Disney2AcmeAdapter donaldAdapter = new Disney2AcmeAdapter(donald);
		characters.add(donaldAdapter);
		
		System.out.println("------------------");
		
		for(AcmeCharacter hero : characters) {
			hero.move();
			hero.takeAHit(50);
		}
	}

}
