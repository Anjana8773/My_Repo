package com.obsqura.bank.Federal;

import com.obsqura.bank.RBI.RBI;

public class Federal {

	RBI rbi;
	double amt;
	double r;
	int n;

	public Federal(RBI rbi, double amt, double r, int n) {
		this.rbi = rbi;
		this.amt = amt;
		this.r = r;
		this.n = n;
	}

	public void checkPan() {

		if (rbi.checkWithdraw(amt)) {
			System.out.println("PAN is needed");

		} else {
			System.out.println("PAN not required");
		}

	}

	public double calCompIntrst() {

		double ci = 0, val = 0;
		val = amt * (1 + r / 100);
		ci = Math.pow(val, n);
		return ci;

	}

}
