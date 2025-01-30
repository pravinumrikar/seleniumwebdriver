package day10;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\Myfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(); /*
													 * In earlier code of FileInputStream, we have passed 'file' to
													 * XSSFWorkbook method. Now here we are not passing 'file' variable
													 * to this method'because currently there is no connection between
													 * these two statements and file is not existed in the folder. Now
													 * we are creating the new excel file with the help of Java
													 * FileOnputStream that is not existed in the folder. later we will
													 * pass this variable to this method
													 */

		XSSFSheet sheet = workbook.createSheet("Data"); // Earlier used getSheet("Sheet1") in FileInputStream

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(03);
		row2.createCell(2).setCellValue("Automation");

		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(05);
		row3.createCell(2).setCellValue("Automation");
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("C#");
		row4.createCell(1).setCellValue(23);
		row4.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created.");

	}
}
