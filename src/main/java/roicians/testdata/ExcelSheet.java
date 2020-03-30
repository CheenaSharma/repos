package roicians.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import roicians.baseclass.Testbase;

public class ExcelSheet extends Testbase {
	
	

	
	// having apache POI

	static Workbook book;
	static Sheet sheet;

	public static Object[][] readExcelData(String sheetName)
	{
	FileInputStream file = null;
	try
	{
	file = new FileInputStream("C:\\Users\\cheen\\eclipse-workspace\\Roicians1\\src\\main\\java\\roicians\\testdata\\SubjectData.xlsx");
	} catch (FileNotFoundException e)
	{
	e.printStackTrace();
	}

	try
	{
	book = WorkbookFactory.create(file);
	} catch (IOException e)
	{
	e.printStackTrace();
	}
	sheet = book.getSheet(sheetName);
	System.out.println(sheet);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	// System.out.println(sheet.getLastRowNum() + "--------" +
	// sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sheet.getLastRowNum(); i++)
	{
	for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++)
	{
	data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
	// System.out.println(data[i][k]);
	}
	}
	return data;
	}
}


