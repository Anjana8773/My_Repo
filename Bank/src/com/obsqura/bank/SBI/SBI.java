package com.obsqura.bank.SBI;

import com.obsqura.bank.RBI.RBI;

public class SBI extends RBI {

	double p;
	int n;
	double r;

	public SBI(double p, double r, int n) {
		super.interestRate(r);
		this.p = p;
		this.n = n;
		this.r = r;
	}

	public double calcSimple() {
		
		double ci = 0;
		ci = (p * n * r) / 100;
		checkWithdraw(p);
		return ci;

	}

}
