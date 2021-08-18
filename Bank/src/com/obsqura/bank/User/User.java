package com.obsqura.bank.User;

import java.util.Scanner;

import com.obsqura.bank.Federal.Federal;
import com.obsqura.bank.RBI.RBI;
import com.obsqura.bank.SBI.SBI;

public class User {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean check = false;
		do {
			System.out.println("Choose your Bank" + "\n1.SBI \n2.Federal \n3.Exit");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				SBI sbi = new SBI(70000,5.7,2);
				double si = sbi.calcSimple();
				System.out.println("Simple Interest of SBI : " + si);
				break;
			case 2:
				Federal fed = new Federal(new RBI(), 20000, 8.5, 5);
				fed.checkPan();
				double comp = fed.calCompIntrst();
				System.out.println("Compound Interest of Federal : " + comp);
				break;
			default:
				check = true;
				break;
			}
		} while (!check);

	}

}
