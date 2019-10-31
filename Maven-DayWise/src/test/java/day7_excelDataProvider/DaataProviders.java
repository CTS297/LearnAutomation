package day7_excelDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DaataProviders {
	
	public Object[][] ExcelData(String path, String sheet)
	{
		ReadWriteExcel excel = new ReadWriteExcel(path, sheet);
	
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		Object TestData[][]  = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0; j<colCount; j++)
			{
				TestData[i-1][j] = excel.readString(i, j);
			}
		}
		return TestData;
	}
}
