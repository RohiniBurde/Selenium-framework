package ExcelData;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Excelconfig {
	XSSFWorkbook wb;
	XSSFSheet Sheet2;

	public void ExcelDataConfig(String excelPath) throws Exception
	{
		try {
			File src=new File(excelPath);
			
			FileInputStream fis=new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Help to read the data from the excel
	
	public String getDataLogin(int sheetNumber, int row, int column)
	{
		Sheet2= wb.getSheet("Login");
		String data1= Sheet2.getRow(row).getCell(column).getStringCellValue();
		return data1;
		
		
	}
	
	
	public int getRowCount(int sheetIndex)
	{
		
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		
		
		return row;
	}
	

}
