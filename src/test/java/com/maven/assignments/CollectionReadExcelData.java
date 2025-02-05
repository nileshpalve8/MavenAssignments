package com.maven.assignments;

import java.util.List;
import java.util.Map;

import com.framework.utilities.ExcelUtil;

public class CollectionReadExcelData {

	public static void main(String[] args) {
		List<Map<String,String>> readData = CollectionsAssignment.readExcelData("collections.xlsx", "Sheet3");
		
		System.out.println(readData.get(1).get("Supplier"));
	}

}
