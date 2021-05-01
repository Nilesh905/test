package Parameterization;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Example3_getBooleanData 
{
public static void main(String[] args) throws   IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\client5\\Desktop\\New folder\\abc.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(3).getCell(3).getBooleanCellValue();
	System.out.println(data);

}
}
