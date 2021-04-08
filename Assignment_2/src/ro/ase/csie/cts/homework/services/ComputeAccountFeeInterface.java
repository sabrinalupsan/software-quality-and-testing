package ro.ase.csie.cts.homework.services;

import ro.ase.csie.cts.homework.Account;

public interface ComputeAccountFeeInterface {
	
	public double computeInterestPrincipal(double accountRate, int daysActive, double loanValue);
	public double computeLoanAndInterest(double loanValue, double interestPrincipal);
	public double computeAccountFee(double loanAndInterest);
	public double calculateAccountFee(Account account);


}
