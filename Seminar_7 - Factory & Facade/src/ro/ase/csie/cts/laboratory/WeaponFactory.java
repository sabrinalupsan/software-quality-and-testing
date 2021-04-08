package ro.ase.csie.cts.laboratory;

public class WeaponFactory {
	
	public static AbstractWeapon getWeapon(WeaponType weaponType, String colour) {
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
