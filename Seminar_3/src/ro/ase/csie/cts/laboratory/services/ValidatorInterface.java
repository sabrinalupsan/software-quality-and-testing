package ro.ase.csie.cts.laboratory.services;

import ro.ase.csie.cts.laboratory.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.laboratory.exceptions.InvalidPriceException;

public interface ValidatorInterface {
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
	public void validatePrice(float price) throws InvalidPriceException;

}
