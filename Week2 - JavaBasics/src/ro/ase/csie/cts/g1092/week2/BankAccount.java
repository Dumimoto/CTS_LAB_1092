package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account {
	protected double balance;
	protected final String iban;
	
	public BankAccount(double balance, String iban ) {
	this.balance = balance;
	this.iban = iban;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	public void transfer(Account destination, double amount)
			throws InsufficientFundsException, IllegalTransferException {
		// TODO Auto-generated method stub
		
	}

}
