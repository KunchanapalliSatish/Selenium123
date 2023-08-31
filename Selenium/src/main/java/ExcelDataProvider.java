import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("./target/Amazon login Test Case.xlsx");
		 System.out.println(file.exists());
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int cells= sheet.getRow(1).getLastCellNum();
		for ( int i=0; i<rows; i++) {
			for (int j=0; j< cells; j++) {
				
				DataFormatter dataformat = new DataFormatter();
				
				System.out.println(dataformat.formatCellValue(sheet.getRow(i).getCell(j)));
				
				
			}
			System.out.println();
		}
		

	}

}
