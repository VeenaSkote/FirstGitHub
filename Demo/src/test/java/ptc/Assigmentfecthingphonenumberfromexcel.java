package ptc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assigmentfecthingphonenumberfromexcel {

	public static void main(String[] args) throws Throwable
	{
		//Step 1:setting the path
				FileInputStream fos = new FileInputStream("./Testdata1.xlsx");
				//Step2:excel ine read mood
				Workbook book = WorkbookFactory.create(fos);
				//Step: fecth the required sheet
				Sheet sheet = book.getSheet("Sheet1");
				//step 4:fech the required row
				Row row = sheet.getRow(0);
		        //step 5:fecth the required coloumn
				Cell cell = row.getCell(0);
				//String exceldata = cell.getStringCellValue();
				double exceldata = cell.getNumericCellValue();
				
				
				System.out.println(exceldata);

	}

}
