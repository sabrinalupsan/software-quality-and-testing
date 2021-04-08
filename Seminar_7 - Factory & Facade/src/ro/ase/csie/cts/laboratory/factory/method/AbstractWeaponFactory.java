package ro.ase.csie.cts.laboratory.factory.method;

import ro.ase.csie.cts.laboratory.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.laboratory.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {
	
	public abstract AbstractWeapon getWeapon(WeaponType weaponType, String colour);

}
