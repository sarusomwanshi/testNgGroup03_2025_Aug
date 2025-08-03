package Sample2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
				@Test(dataProvider ="dataTest" )
				public void fetchData(String fname,String lastName) {
					System.out.println(fname+" "+lastName);
				}
				@DataProvider(name="dataTest")
				public Object[][] getData() throws IOException{
					FileInputStream fis = new FileInputStream("E:\\SoftwareTestingRevise\\testData.xlsx");
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
					XSSFSheet sheet = workbook.getSheet("DataSheet");
					int rows = sheet.getLastRowNum();
					int columns = sheet.getRow(0).getLastCellNum();
					System.out.println(rows +" "+columns);
					Object [][] data = new Object[rows][columns];
					for(int i=1;i<=rows;i++) {
						for(int j=0;j<columns;j++) {
							data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
						}
						
						
					}
					
					return data;
					
				}
 }
