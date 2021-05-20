package ro.ase.csie.cts.laboratory.memento;

import java.util.Date;

public class SuperHeroMemento {
	String name;
	int lifePoints;
	String magic;
	
	Date timestamp;
	
	public SuperHeroMemento(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = new Date();
	}
}
