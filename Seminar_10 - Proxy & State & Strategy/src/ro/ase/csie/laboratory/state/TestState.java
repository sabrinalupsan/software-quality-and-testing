package ro.ase.csie.laboratory.state;

public class TestState {
	
	public static void main(String[] args) {
	
	SuperHero hero = new SuperHero("John", 500);
	hero.move();
	
	hero.takeAHit(490);
	hero.move();
	hero.heal(20);
	hero.move();
	hero.heal(100);
	hero.move();
	
	}

}
