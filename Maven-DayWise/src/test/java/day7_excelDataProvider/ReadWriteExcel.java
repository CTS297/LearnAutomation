package day7_excelDataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {
	XSSFWorkbook WB; 
	XSSFSheet WS;
	
	public ReadWriteExcel(String ExcelPath, String Sheetname) {

		//String ProjectPath = System.getProperty("user.dir");
		try
		{
			//WB = new XSSFWorkbook(ProjectPath+"//src//main//resources//Excels//OrangeFRMData.xlsx");
			WB = new XSSFWorkbook(ExcelPath);
			WS = WB.getSheet(Sheetname);
		}
		catch (Exception e) {
			System.out.println("File not found");
		}

	
	}
	public int getColumnCount()
	{
		int colCount = WS.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}
	public int getRowCount()
	{
		int rowCount = WS.getPhysicalNumberOfRows();
		return rowCount;
	}

	public String readString(int row, int col)
	{
		String data = WS.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

	public double readNumber(int row, int col)
	{
		double data = WS.getRow(row).getCell(col).getNumericCellValue();
		return data;
	}

	public void writeString(int row, int col, String value)
	{
		WS.getRow(row).getCell(col).setCellValue(value);
	}
}
