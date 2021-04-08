package ro.ase.csie.cts.laboratory.factory.method;

import ro.ase.csie.cts.laboratory.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.laboratory.factory.simple.Pistol;
import ro.ase.csie.cts.laboratory.factory.simple.WeaponType;

public class TestFactoryMethod {

	public static void main(String[] args) {

		boolean isWaterModeSet = true;
		if(isWaterModeSet) {
			//code the game using water-based weapons
			AbstractWeapon pistol = new WaterPistol("grey", 200);
		}
		else
		{
			AbstractWeapon pistol = new Pistol("grey", 200);
		}
		
		AbstractWeaponFactory theFactory = null;
		theFactory = (isWaterModeSet) ? new KidsModeFactory() : new RealModeFactory();
		AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");
		}

}
