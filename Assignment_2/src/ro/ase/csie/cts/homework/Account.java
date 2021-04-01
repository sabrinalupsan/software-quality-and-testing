package ro.ase.csie.cts.homework;

import ro.ase.csie.cts.homework.exceptions.NegativeValueException;

public class Account {
	public double loanValue, accountRate;
	public int daysActive;
	public static AccountType accountType;
	public static final double BROKER_FEE = 0.125;

	public double getLoan() {
		return this.loanValue;
	}

	public double getRate() {
		return this.accountRate;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValue * this.accountRate;
	}

	public void setValue(double value) throws NegativeValueException {
				
		if (value < 0)
			throw new NegativeValueException();
		else {
			this.loanValue = value;
		}
	}

	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.accountRate + "; days active:" + this.daysActive + "; Type: "
				+ this.accountType + ";";
	}
	
	public static double computeInterestPrincipal(double accountRate, int daysActive, double loanValue)
	{
		return  Math.pow(accountRate, (daysActive / 365 - loanValue));
	}
	
	//public double calculateInterestPrincipal()

	public static double calculateTotalAccountsFee(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE * ( 
				account.loanValue * computeInterestPrincipal(account.accountRate, account.daysActive, account.loanValue)); // interest-principal
		}
		return totalFee;
	}

	public Account(double value, double rate, AccountType accountType) throws NegativeValueException {
		setValue(value);
		this.accountRate = rate;
		this.accountType = accountType;
	}
}
