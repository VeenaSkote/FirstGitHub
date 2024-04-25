package ptc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchingmixeddatafromexcel {

	public static void main(String[] args) throws Throwable
	{
		// TODO Auto-generated method stub//Step 1:setting the path
		FileInputStream fos = new FileInputStream("./Testdata1.xlsx");
		//Step2:excel ine read mood
		Workbook book = WorkbookFactory.create(fos);
		//Step: fecth the required sheet
		Sheet sheet = book.getSheet("Sheet2");
		//step 4:fech the required row
		Row row = sheet.getRow(1);
        //step 5:fecth the required coloumn
		Cell cell = row.getCell(1);
		String exceldata = cell.getStringCellValue();
		System.out.println(exceldata);


	}

}
