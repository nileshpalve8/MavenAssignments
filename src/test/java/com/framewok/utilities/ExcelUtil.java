package com.framewok.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static String[][] readData(String fileName, String sheetName){
		String[][] data = null;
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			int totalRows = sheet.getPhysicalNumberOfRows();
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			data = new String [totalRows-1][totalColumns];
			
			for(int r=1; r<totalRows; r++) {
				for(int c=0; c<totalColumns; c++) {
					data[r-1][c] = sheet.getRow(r).getCell(c).getStringCellValue();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
