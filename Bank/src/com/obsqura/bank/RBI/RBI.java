package com.obsqura.bank.RBI;

public class RBI {
	
	double interest;

	protected double interestRate(double r) {
		this.interest=r;
		return interest;

	}

	public boolean checkWithdraw(double amt) {

		if (amt > 50000) {
			System.out.println("Withdraw amount is greater than 50000");
			return true;
		} else {
			System.out.println("Withdraw amount is less than 50000");
			return false;
		}
	}

}
