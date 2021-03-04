package ro.ase.csie.laboratory.models;

public abstract class BankAccount extends Account{
	
	protected String iban;
	protected double balance;
	
	public BankAccount(String iban, double balance)
	{
		this.iban = iban;
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
	
	
}
