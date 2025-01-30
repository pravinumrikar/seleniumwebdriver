package day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {
		
		public static void main(String[] args) throws IOException {

			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\Myfile_Dynamic_Data.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(); /*
														 * In earlier code of FileInputStream, we have passed 'file' to
														 * XSSFWorkbook method. Now here we are not passing 'file' variable
														 * to this method'because currently there is no connection between
														 * these two statements and file is not existed in the folder. Now
														 * we are creating the new excel file with the help of Java
														 * FileOnputStream that is not existed in the folder. later we will
														 * pass this variable to this method
														 */

			XSSFSheet sheet = workbook.createSheet("DynamicData"); // Earlier used getSheet("Sheet1") in FileInputStream
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter how many rows?");
			int noOfrows=sc.nextInt();
			
			System.out.println("Enter how many cells?");
			int noOfcells=sc.nextInt();
			
			for(int r=0; r<noOfrows; r++) {
				
				XSSFRow currentRow=sheet.createRow(r);
				
				for(int c=0; c<noOfcells; c++) {
					
					XSSFCell cell=currentRow.createCell(c);
					cell.setCellValue(sc.next());
				}
			}
			
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("File is created.");
			
	}

}
