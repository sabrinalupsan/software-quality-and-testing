package ro.ase.csie.cts.laboratory.memento;

public class TestMemento {

	public static void main(String[] args) {
		SuperHero superman = new SuperHero("Superman",  100,  "Fly");
		
		SuperHeroMemento initialSave = superman.save();
		superman.takeHit(50);
		superman.takeHit(20);
		System.out.println("Life points: "+superman.lifePoints);
		
		superman.restore(initialSave);
		System.out.println("Life points: "+superman.lifePoints);

	}

}
