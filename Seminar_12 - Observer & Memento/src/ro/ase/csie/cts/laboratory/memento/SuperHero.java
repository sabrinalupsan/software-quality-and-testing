package ro.ase.csie.cts.laboratory.memento;

public class SuperHero {
	
	String name;
	int lifePoints;
	String magic;
	
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking");
	}
	
	public void heal(int points) {
		this.lifePoints+=points;
	}
	
	public void takeHit(int points) {
		this.lifePoints-= points;
	}
	
	public SuperHeroMemento save() {
		return new SuperHeroMemento(this.name,  
				this.lifePoints, this.magic);
	}
	
	public void restore(SuperHeroMemento memento) {
		this.name = memento.name;
		this.lifePoints = memento.lifePoints;
		this.magic = memento.magic;
	}

}
