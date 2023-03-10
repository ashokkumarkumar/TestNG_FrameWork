//Write a script to read specific row column data in a cell:
package dec16;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadDataPresent_1 {
	public static void main(String[] args)throws Throwable {
		
//1.read path of excel file
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		
//2.get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);

//3.get sheet from wb
		XSSFSheet ws = wb.getSheetAt(0);
		
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);

//4.get fifth row 
		XSSFRow row =ws.getRow(5);
		
//5.get cell from row
		XSSFCell c1=row.getCell(0);
		XSSFCell c2 = row.getCell(1);
		XSSFCell c3 =row.getCell(2);
		XSSFCell c4 = row.getCell(3);

//6.print each cell data
		
		//6a.storing 1st 3cells into string type ( get cellvalue from 1st 3cells, i.e string type ) 
			String  fname =c1.getStringCellValue();
			String mname = c2.getStringCellValue();
			String lname = c3.getStringCellValue();
			
		//6b.storing 4th cell into int type ( get cellvalue from 4th cell, i.e int type )
			int eid = (int) c4.getNumericCellValue();
		
		System.out.println(fname+"   "+mname+"    "+lname+"     "+eid);
//7.close file
		
		fi.close();
		
//8.close workbook
		wb.close();
		
		}

}