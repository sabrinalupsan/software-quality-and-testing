package ro.ase.csie.cts.laboratory;

public abstract class AbstractWeapon {
	
	String colour;
	int power;
	
	
	
	public AbstractWeapon(String colour, int power) {
		super();
		this.colour = colour;
		this.power = power;
	}



	public abstract void pewPew();

}
