package ro.ase.csie.cts.homework.services;

import ro.ase.csie.cts.homework.exceptions.InvalidRateException;
import ro.ase.csie.cts.homework.exceptions.NegativeValueException;

public interface ValidatorInterface {
	public void validateLoanValue(double loanValue) throws NegativeValueException;
	public void validateAccountRate(double accountPercentageRate) throws InvalidRateException;
	public void validateDaysActive(int daysActive) throws NegativeValueException;
}
