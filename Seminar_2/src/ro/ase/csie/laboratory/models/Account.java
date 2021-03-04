package ro.ase.csie.laboratory.models;

public abstract class Account {

	public abstract double getBalance();
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount);
	public abstract void transfer(Account destination, Double amount);
}
