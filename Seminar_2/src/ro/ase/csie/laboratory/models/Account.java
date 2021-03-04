package ro.ase.csie.laboratory.models;

import ro.ase.csie.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.laboratory.exceptions.InsufficientFundsException;

public abstract class Account {

	public abstract double getBalance();
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFundsException;
	public abstract void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException;
}
