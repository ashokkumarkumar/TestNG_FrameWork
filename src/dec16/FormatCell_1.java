//Write a script to format cell with green and red colour:
//not understood commands
package dec16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatCell_1 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheet("EmpData");
		
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		
		for (int i = 1; i <=rc; i++) {
			ws.getRow(i).createCell(4).setCellValue("Fail");
			XSSFCellStyle style=wb.createCellStyle();
			XSSFFont font=wb.createFont();
			font.setColor(IndexedColors.RED.getIndex());
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(4).setCellStyle(style);
			}
		
		fi.close();
		
		FileOutputStream fo=new FileOutputStream("D:/Results.xlsx");
		wb.write(fo);
		
		fo.close();
		wb.close();
	}

}
