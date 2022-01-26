package com.obsqura.excel.java;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		//Excel read starts from [0,0]
		String s1=ExcelRead.readIntegerData(1, 0);
		System.out.println(s1);
		String s2=ExcelRead.readStringData(1, 1);
		System.out.println(s2);

	}

}
