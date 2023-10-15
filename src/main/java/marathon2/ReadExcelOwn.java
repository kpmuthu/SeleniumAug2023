package marathon2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelOwn {

	public static String[][] exceldata(String excelFilePath, String sheetName) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wb = new XSSFWorkbook(excelFilePath);

		XSSFSheet sheet = wb.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum();

		int colcount = sheet.getRow(0).getLastCellNum();

		String data[][] = new String[rowCount][colcount];

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();

				System.out.println(stringCellValue);

				data[i - 1][j] = stringCellValue;
			}
		}
		wb.close();
		return data;

	}

}
