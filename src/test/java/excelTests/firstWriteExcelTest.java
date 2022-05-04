package excelTests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class firstWriteExcelTest {
	public static void main(String[] args) throws IOException {
		
		String excelPath = "C:/Users/p_gab/eclipse-workspace/Batch9_Selenium"
				+ "/src/test/resources/dataFolder/data.xlsx";

		FileInputStream fs = new FileInputStream(excelPath);
//create object for workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
//access  to sheet1
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		
		for (int i = 1; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			//create data on column 5
			Cell cell = row.createCell(5);
			//pass data to that cell
			cell.setCellValue("Pass");			
		}
		
		Row row = sheet.getRow(2);
		Cell cell = row.createCell(1);
		cell.setCellValue("Maneesuk");
		
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		workbook.write(fos);
		fos.close();
		workbook.close();

	}
}
