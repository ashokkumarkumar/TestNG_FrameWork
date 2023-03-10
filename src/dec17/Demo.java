package dec17;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Demo {
public static void main(String[] args) throws Throwable {
		
		FileInputStream fi =  new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpData");
		
		int rc= ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		
		for(int i=1;i<=rc;i++)
		{
			if(wb.getSheet("EmpData").getRow(i).getCell(3).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata =(int)wb.getSheet("EmpData").getRow(i).getCell(3).getNumericCellValue();
				//convert to string type
				String eid =String.valueOf(celldata);
				System.out.println(eid);
			}
		}
	}
}