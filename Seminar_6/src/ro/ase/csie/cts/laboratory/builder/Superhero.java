package ro.ase.csie.cts.laboratory.builder;

public class Superhero {
	
	private String name;
	private int lifePoints;
	private boolean isVillain;
	private boolean isWounded;
	private WeaponInterface rightWeapon;
	private WeaponInterface leftWeapon;
	private SuperPowerInterface superPower;
	private SuperPowerInterface superSuperPower;
	
	private Superhero() {
		super();
	}
	
	private Superhero(
			String name, 
			int lifePoints, 
			boolean isVillain, 
			boolean isWounded, 
			WeaponInterface rightWeapon,
			WeaponInterface leftWeapon, 
			SuperPowerInterface superPower, 
			SuperPowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public static class SuperheroBuilder {
		
		Superhero superhero;
		public SuperheroBuilder(String name, int lifePoints) {
			this.superhero = new Superhero();
			superhero.name = name;
			superhero.lifePoints = lifePoints;
		}
		
		public SuperheroBuilder isVillain() {
			this.superhero.isVillain = true;
			return this;
		}
		
		public SuperheroBuilder isWounded() {
			this.superhero.isWounded = true;
			return this;
		}
		
		public SuperheroBuilder setRightWeapon(WeaponInterface weapon) {
			this.superhero.rightWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setLeftWeapon(WeaponInterface weapon) {
			this.superhero.leftWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setSuperPower(SuperPowerInterface power) {
			this.superhero.superPower = power;
			return this;
		}
		
		public SuperheroBuilder setSuperSuperPower(SuperPowerInterface power) {
			this.superhero.superSuperPower = power;
			return this;
		}
		
		public Superhero build() {
			return this.superhero;
		}
		
	}

}
