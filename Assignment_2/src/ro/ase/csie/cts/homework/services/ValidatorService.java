package ro.ase.csie.cts.homework.services;

import ro.ase.csie.cts.homework.exceptions.InvalidRateException;
import ro.ase.csie.cts.homework.exceptions.NegativeValueException;

public class ValidatorService implements ValidatorInterface {

	@Override
	public void validateLoanValue(double loanValue) throws NegativeValueException {
		if(loanValue <0)
			throw new NegativeValueException();
	}

	@Override
	public void validateAccountRate(double accountPercentageRate) throws InvalidRateException {
		if(accountPercentageRate < 0 || accountPercentageRate > 1)
			throw new InvalidRateException();
	}

	@Override
	public void validateDaysActive(int daysActive) throws NegativeValueException {
		if(daysActive<0)
			throw new NegativeValueException();
		
	}

}
