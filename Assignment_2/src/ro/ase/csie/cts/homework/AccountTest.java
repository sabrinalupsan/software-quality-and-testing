package ro.ase.csie.cts.homework;

import ro.ase.csie.cts.homework.exceptions.InvalidRateException;
import ro.ase.csie.cts.homework.exceptions.NegativeValueException;
import ro.ase.csie.cts.homework.services.ComputeAccountFeeClass;
import ro.ase.csie.cts.homework.services.ValidatorService;

public class AccountTest {

	public static void main(String[] args) {
		ValidatorService validatorService = new ValidatorService();
		ComputeAccountFeeClass computeFeeService = new ComputeAccountFeeClass();
		try {
			Account account = new Account(7000, 0.28, AccountType.BUDGET, 10, validatorService, computeFeeService);
			Account account2 = new Account(700, 0.84, AccountType.PREMIUM, 100, validatorService, computeFeeService);
			Account[] accounts = new Account[] {account, account2};

			System.out.println(Account.calculateTotalAccountsFee(accounts));
		} catch (NegativeValueException | InvalidRateException e) {
		}
	}

}
