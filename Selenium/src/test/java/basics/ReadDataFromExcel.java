package basics;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("./src/test/java/basics/workbook1.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook( stream);
		
		XSSFSheet sheet = workbook.getSheet("sheet3");
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		int cells=sheet.getRow(3).getLastCellNum();
		
		for (int i=2 ;i<rows; i--) {
			
			for(int j=1; j<cells; j--) {
				
				DataFormatter df= new DataFormatter();
				
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));;
			}

	}
		
		stream.close();
		workbook.close();

}
}