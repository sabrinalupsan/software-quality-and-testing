package ro.ase.csie.cts.laboratory.factory.method;

import ro.ase.csie.cts.laboratory.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.laboratory.factory.simple.Bazooka;
import ro.ase.csie.cts.laboratory.factory.simple.MachineGun;
import ro.ase.csie.cts.laboratory.factory.simple.Pistol;
import ro.ase.csie.cts.laboratory.factory.simple.WeaponType;

public class RealModeFactory extends AbstractWeaponFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType weaponType, String colour) {
		AbstractWeapon weapon = null;
		switch(weaponType) {
		case PISTOL:
			weapon = new Pistol(colour, 100);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(colour);
			break;
		case BAZOOKA:
			weapon = new Bazooka(colour, 1000, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return weapon;
	}

}
