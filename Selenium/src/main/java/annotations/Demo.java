package annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Demo {
	
	@DataProvider(name="data")
	
	public Object[][] d1() throws IOException{

		File file = new File("./DatA1.xlsx");

		FileInputStream stream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook( stream);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows=sheet.getPhysicalNumberOfRows();

		int cells=sheet.getRow(1).getLastCellNum();

		Object[][] data=new Object[rows-1][cells];

		for (int i=0 ;i<rows-1; i++) {

			for(int j=0; j<cells; j++)
			{
				
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
}

		}

		return data;

	}

}
