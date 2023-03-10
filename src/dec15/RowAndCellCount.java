package dec15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowAndCellCount {

	public static void main(String[] args) throws Throwable {
		//read path of excel file
		FileInputStream fi=new FileInputStream("D://sample.xlsx");
		//get workbook from sample file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from workbook
		XSSFSheet ws=wb.getSheet("EmpData");
		//get first row from sheet
		XSSFRow row=ws.getRow(0);
		//count no of rows in sheet
		int rc=ws.getLastRowNum();
		//count no of cells iin first row
		int cc=row.getLastCellNum();
		System.out.println("no of rows::"+rc+"     "+"no of cells::"+cc);
		fi.close();
		wb.close();
	}
}
