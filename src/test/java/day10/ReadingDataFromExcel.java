package day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel_file-->workbook-->sheets-->rows-->cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\DummyData.xlsx"); // Open
																													// the
																													// Excel_file

		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file); // Open the workbook

		XSSFSheet sheet = workbook.getSheet("Sheet1"); // Open the sheet in two ways
		// Or
		// XSSFSheet sheet=workbook.getSheetAt(0);

		int totalRows = sheet.getLastRowNum(); // get total number of rows
		int totalCells = sheet.getRow(1).getLastCellNum(); // get total number of cells

		System.out.println("number of rows: " + totalRows);
		System.out.println("number of cells: " + totalCells);

		for (int r = 0; r <= totalRows; r++) { // Outer for loop represents Rows and as per Java' row counting starts
												// from zero

			XSSFRow currentRow = sheet.getRow(r); // get or read values from rows

			for (int c = 0; c < totalCells; c++) { // Outer for loop represents cells and as per Java, cells counting
													// starts from zero
				XSSFCell cell = currentRow.getCell(c); // get or read values from cells
				System.out.print(cell.toString()+"\t"); //use print only and add escape sequence for tabular format output in console
			}
			System.out.println(); //print data in tabular format
		}
		workbook.close();
		file.close();
	}

}
