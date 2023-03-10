//Write a script to read all rows all columns and write into results cell by creating new work book:
package dec16;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadWrite_2 {
public static void main(String[] args)throws Throwable {
		
	FileInputStream fi=new FileInputStream("D:/sample.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet("EmpData");
	
	int rc=ws.getLastRowNum();
	

for (int i = 1; i <=rc; i++) {
	String fname=ws.getRow(i).getCell(0).getStringCellValue();
	String mname=ws.getRow(i).getCell(1).getStringCellValue();
	String lname=ws.getRow(i).getCell(2).getStringCellValue();
	int eid=(int) ws.getRow(i).getCell(3).getNumericCellValue();
	System.out.println(fname+"   "+mname+"   "+lname+"   "+eid);
	ws.getRow(i).createCell(4).setCellValue("Pass");
}

//close input file
	fi.close();

//write into new workbook
	FileOutputStream fo=new FileOutputStream("D:/Results.xlsx");
	wb.write(fo);
	
//close output file
	fo.close();
		
//close workbook
	wb.close();
	}
}