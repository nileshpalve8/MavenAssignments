package com.framewok.utilities;

public class ReadExcelData {

	public static void main(String[] args) {
		String [][] data = ExcelUtil.readData("TestData.xlsx", "Sheet1");
		
		for(String[] dataset : data) {
			for(String values : dataset) {
				System.out.println(values);
			}
		}

	}

}
