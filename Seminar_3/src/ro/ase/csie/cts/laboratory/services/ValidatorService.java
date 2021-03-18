package ro.ase.csie.cts.laboratory.services;

import ro.ase.csie.cts.laboratory.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.laboratory.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorInterface {

	@Override
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {
		if(accountAgeInYears < 0)
			throw new InvalidAccountAgeException();		
	}

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if(price <= 0)
			throw new InvalidPriceException();		
	}

}
