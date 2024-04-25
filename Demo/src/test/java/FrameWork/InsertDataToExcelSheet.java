package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {

	public static void main(String[] args) throws Throwable 
	{
		//Step 1:setting the path
				FileInputStream fin = new FileInputStream("./Testdata1.xlsx");
				//Step2:excel ine read mood
				Workbook book = WorkbookFactory.create(fin);
				//Step: fecth the required sheet
				Sheet sheet = book.getSheet("Sheet1");
				Row row = sheet.createRow(2);
				Cell cell = row.createCell(2);
				cell.setCellValue("veena");
				 FileOutputStream	fos=new FileOutputStream("./Testdata1.xlsx");
				book.write(fos);
				book.close();
	}

}
