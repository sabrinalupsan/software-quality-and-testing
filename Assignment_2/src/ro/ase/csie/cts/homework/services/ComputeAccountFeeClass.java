package ro.ase.csie.cts.homework.services;

import ro.ase.csie.cts.homework.Account;
import ro.ase.csie.cts.homework.AccountType;

public class ComputeAccountFeeClass implements ComputeAccountFeeInterface {
	
	static final double BROKER_FEE = 0.125;

	public double computeInterestPrincipal(double accountRate, int daysActive, double loanValue) {
		return Math.pow(accountRate, ((daysActive / 365.0) - loanValue));
	}
	
	public double computeLoanAndInterest(double loanValue, double interestPrincipal) {
		return loanValue * interestPrincipal;
	}
	
	public double computeAccountFee(double loanAndInterest) {
		return BROKER_FEE * loanAndInterest;
	}
	
	public double calculateAccountFee(Account account) {
		double totalFee = 0.0;
		if (account.getAccountType() == AccountType.PREMIUM || account.getAccountType() == AccountType.SUPER_PREMIUM) {
			double interest = computeInterestPrincipal(account.getAccountPercentageRate(), account.getDaysActive(), account.getLoanValue());
			double loanAndInterest = computeLoanAndInterest(account.getLoanValue(), interest);
			totalFee += computeAccountFee(loanAndInterest);
		}
		
		return totalFee;
	}

}
