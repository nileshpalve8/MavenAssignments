package com.maven.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CollectionsAssignment {
	
	public static List<Map<String,String>> readExcelData(String fileName, String sheetName){
		
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			int totalRows = sheet.getPhysicalNumberOfRows();
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();

			for(int r=1; r<totalRows; r++) {
				Map<String,String> rowData = new HashMap<String,String>();
				for(int c=0; c<totalColumns; c++){
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					String columnValue = "";
	                // Handle cell types
	                switch (sheet.getRow(r).getCell(c).getCellType()) {
	                    case STRING:
	                        columnValue = sheet.getRow(r).getCell(c).getStringCellValue();
	                        break;
	                    case NUMERIC:
	                        columnValue = String.valueOf(sheet.getRow(r).getCell(c).getNumericCellValue());
	                        break;
	                    case BOOLEAN:
	                        columnValue = String.valueOf(sheet.getRow(r).getCell(c).getBooleanCellValue());
	                        break;
	                    case BLANK:
	                        columnValue = ""; // Leave it blank
	                        break;
	                    default:
	                        columnValue = "Unsupported Type"; // Handle other types
	                }
					rowData.put(columnName, columnValue);
				}
				
				data.add(rowData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
		
	}

}
