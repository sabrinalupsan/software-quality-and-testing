package ro.ase.csie.cts.laboratory.factory.method;

import ro.ase.csie.cts.laboratory.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.laboratory.factory.simple.Bazooka;
import ro.ase.csie.cts.laboratory.factory.simple.MachineGun;
import ro.ase.csie.cts.laboratory.factory.simple.Pistol;
import ro.ase.csie.cts.laboratory.factory.simple.WeaponType;

public class KidsModeFactory extends AbstractWeaponFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType weaponType, String colour) {
		AbstractWeapon weapon = null;
		switch(weaponType) {
		case PISTOL:
			weapon = new WaterPistol(colour, 200);
			break;
		case MACHINE_GUN:
			weapon = new WaterBalloon(colour, 500);
			break;
		case BAZOOKA:
			weapon = new WaterBucket(colour, 1000);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return weapon;	
		}

}
