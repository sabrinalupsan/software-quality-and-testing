package ro.ase.csie.cts.laboratory;

public class Bazooka extends AbstractWeapon{

	public Bazooka(String colour, int power, int distance) {
		super(colour, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		System.out.println("-------> (*****");
	}
	
	

}
