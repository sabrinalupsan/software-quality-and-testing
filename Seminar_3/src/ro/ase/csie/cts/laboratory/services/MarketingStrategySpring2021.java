package ro.ase.csie.cts.laboratory.services;

public class MarketingStrategySpring2021 implements MarketingInterface{

	@Override
	public float getFidelityDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT
				: (float) accountAgeInYears / 100;
		}

}
