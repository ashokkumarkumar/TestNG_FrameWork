//Write a script to read specific row column data in a cell:
package dec16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataPresent_SecondMethod_1 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("D:/sample.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpData");
		
		int rc=ws.getLastRowNum();
		System.out.println("no of rows::"+rc);

		String fname=ws.getRow(9).getCell(0).getStringCellValue();
		String mname=ws.getRow(7).getCell(1).getStringCellValue();
		String lname=ws.getRow(5).getCell(2).getStringCellValue();
		int eid=(int) ws.getRow(9).getCell(3).getNumericCellValue();
		System.out.println(fname+""+mname+""+lname+"");
		fi.close();
		wb.close();
	
	}

}
