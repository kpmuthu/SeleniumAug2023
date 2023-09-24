package assessments.week6.day1;

import java.io.IOException;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getData(String excelFilePath, String sheetname) throws IOException {
		
		//open Excel	
		XSSFWorkbook book=new XSSFWorkbook(excelFilePath);
		
		//open sheet
		XSSFSheet sheet = book.getSheet(sheetname);
		
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		
		String [][] data= new String[rowNum][cellNum];
	
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow eachrow = sheet.getRow(i);
			for (int j = 0; j <cellNum; j++) {
				XSSFCell eachcell = eachrow.getCell(j);
				String value = eachcell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
			
		}
		
		book.close();
		return data;
		
	}

}
