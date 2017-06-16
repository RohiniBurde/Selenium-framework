package ExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\rohini.burde\\Desktop\\Rohdocs\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rownum = sheet1.getLastRowNum();
		int totalColumn = sheet1.getRow(0).getLastCellNum();

		for (int i = 1; i < rownum; i++) {

			for (int j = 0; j < totalColumn; j++) {

				String col = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(col);
			}

		}

	}

}
