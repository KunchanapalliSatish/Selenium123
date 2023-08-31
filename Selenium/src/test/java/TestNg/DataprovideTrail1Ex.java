package TestNg;

import org.testng.annotations.Test;
import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	

public class DataprovideTrail1Ex {


	  
	  	
	  	@ Test 
	  	@DataProvider

	  	public String [][]  face() throws Throwable  {
	  		
	  		File file=new File("./target/Test.xlsx");
	  		System.out.println(file.exists());
	  		FileInputStream stream=new FileInputStream(file);
	  		XSSFWorkbook workbook=new XSSFWorkbook(stream);
	  		
	  		XSSFSheet sheet=workbook.getSheet("sheet1");
	  		int rows=sheet.getPhysicalNumberOfRows();
	  		int cells= sheet.getRow(1).getLastCellNum();
	  		
	  		String [][] data=new String [rows-1][cells];
	  		 for(int i=0; i<rows-1;i++) {
	  			 for(int j=0; j<cells;j++) {
	  			DataFormatter df=new  DataFormatter();
	  			
	  			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
	  		
	  			//System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
	  				 
	  			 }
	  		 }
	  		workbook.close();
	  		stream.close();
	  		return data;

	  }	

	  

  }

