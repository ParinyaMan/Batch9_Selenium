package excelTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class firstExcelTest {

	public static void main(String[] args) throws IOException {
		
		String excelPath = "C:/Users/p_gab/eclipse-workspace/Batch9_Selenium"
							+ "/src/test/resources/dataFolder/data.xlsx";
		
		FileInputStream fs = new FileInputStream(excelPath);
		//create object for workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		//access  to sheet1
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//access to data
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("1 - " + sheet.getRow(0).getCell(0));
		System.out.println("2 - " + sheet.getRow(0).getCell(4));
		
		//format the data type for file
		DataFormatter objDefaultFormat = new DataFormatter();
		
		System.out.println("\n\nIterating over Rows and Colums using for each loop");
		
		for (Row row1 : sheet) {
			for (Cell cell1 : row1) {
				
				String cellValue = objDefaultFormat.formatCellValue(cell1);
				System.out.print(cellValue + "      \t");
			}
			System.out.println(" ");
		}
		
		
		
		workbook.close();
	}

}
