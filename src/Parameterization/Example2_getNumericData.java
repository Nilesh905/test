package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getNumericData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream  ("C:\\Users\\client5\\Desktop\\New folder\\abc.xlsx");
	double data = WorkbookFactory .create(file).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(data);
}
}
