package dec15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowAndCellCount_2 {

	public static void main(String[] args) throws Throwable {

//1.read path of excel file
		FileInputStream fi=new FileInputStream("D://sample.xlsx");
		
//2.get workbook from sample file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
//3.get sheet from workbook
		XSSFSheet ws=wb.getSheet("EmpData");
		
//4.get first row from sheet
		XSSFRow row=ws.getRow(0);
		
//5.count no of rows in sheet
		int rc=ws.getLastRowNum();
		
//6.count no of cells iin first row
		int cc=row.getLastCellNum();
		
		System.out.println("no of rows::"+rc+"     "+"no of cells::"+cc);
		
		fi.close();
		wb.close();
	}
}
