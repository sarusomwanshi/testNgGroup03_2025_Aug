package Sample2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadData {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\SoftwareTestingRevise\\testData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet Ab = workbook.getSheet("DataSheet");
		
		

		String Mock = Ab.getRow(0).getCell(1).getStringCellValue();
		System.out.println(Ab.getLastRowNum()+" :rows");
		System.out.println(Ab.getRow(0).getLastCellNum()+" :cloumns");
		
		System.out.println(Mock);
	}
}
