package ro.ase.csie.cts.homework;

import ro.ase.csie.cts.homework.exceptions.InvalidRateException;
import ro.ase.csie.cts.homework.exceptions.NegativeValueException;
import ro.ase.csie.cts.homework.services.ComputeAccountFeeClass;
import ro.ase.csie.cts.homework.services.ValidatorInterface;

public class Account implements AccountInterface {
	private double loanValue, accountPercentageRate;
	private int daysActive;
	private AccountType accountType;
	private ValidatorInterface validatorService = null;
	private static ComputeAccountFeeClass computeFeeService = null;
	
	public Account(double loanValue, double accountPercentageRate, AccountType accountType, int daysActive, ValidatorInterface validatorService, ComputeAccountFeeClass computeFeeService) throws NegativeValueException, InvalidRateException {
		if(validatorService == null)
			throw new NullPointerException();
		if(computeFeeService == null)
			throw new NullPointerException();
		this.computeFeeService = computeFeeService;
		this.validatorService = validatorService;
		
		setLoanValue(loanValue);
		setAccountPercentageRate(accountPercentageRate);
		setAccountType(accountType);
		setDaysActive(daysActive);
	}

	public double getLoanValue() {
		return this.loanValue;
	}

	public double getAccountPercentageRate() {
		return this.accountPercentageRate;
	}

	public int getDaysActive() {
		return daysActive;
	}

	public double getMonthlyPayment() {
		return this.loanValue * this.accountPercentageRate;
	}
	

	public AccountType getAccountType() {
		return this.accountType;
	}

	public void setLoanValue(double loanValue) throws NegativeValueException {	
		this.validatorService.validateLoanValue(loanValue);
		this.loanValue = loanValue;
	}
	
	public void setAccountPercentageRate (double accountPercentageRate) throws InvalidRateException {
		this.validatorService.validateAccountRate(accountPercentageRate);
		this.accountPercentageRate = accountPercentageRate;
	}
	
	public void setDaysActive (int daysActive) throws NegativeValueException {
		this.validatorService.validateDaysActive(daysActive);
		this.daysActive = daysActive;
	}


	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.accountPercentageRate + "; days active:" + this.daysActive + "; Type: "
				+ this.accountType + ";";
	}
	
	public static double calculateTotalAccountsFee(Account[] accounts) {
		double totalFee = 0.0;
		
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			totalFee+=computeFeeService.calculateAccountFee(account);
		}
		return totalFee;
	}

}