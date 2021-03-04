package ro.ase.csie.laboratory.models;

import ro.ase.csie.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.laboratory.exceptions.InsufficientFundsException;
import ro.ase.csie.laboratory.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {
	
	public static final double MIN_BALANCE = 100; 

	public SavingsAccount(String iban) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void deposit(Double amount) {
		this.balance+=amount; // validate for an overflow or for negative values
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException{
		if(amount > this.balance)
			throw new InsufficientFundsException("You need more money");
		else
			this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
		if(this==destination)
			throw new IllegalTransferException();
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
	@Override
	public void addInterest(double interestPercentRate)
	{
		this.balance *= (1+interestPercentRate/100);
	}

}
