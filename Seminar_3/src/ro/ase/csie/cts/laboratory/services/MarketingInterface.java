package ro.ase.csie.cts.laboratory.services;

public interface MarketingInterface {
	public static final int MAX_ACCOUNT_AGE = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	public float getFidelityDiscount(int accountAgeInYears);
}
