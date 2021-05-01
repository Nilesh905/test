package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getRowSize
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	
	FileInputStream file=new FileInputStream("C:\\Users\\client5\\Desktop\\New folder\\abc.xlsx");
	
	int LastRowNum = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println(LastRowNum);

}
}