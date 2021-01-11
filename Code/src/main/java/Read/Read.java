package Read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		/*
		 * FileInputStream fis = new FileInputStream("D:\\TestData\\TestData.xlsx");
		 * XSSFWorkbook wb = new XSSFWorkbook(fis); XSSFSheet sheet =
		 * wb.getSheet("LeadRequirements"); int rowcount; int columcount;
		 * 
		 * rowcount = sheet.getLastRowNum();
		 * 
		 * 
		 * 
		 * 
		 * XSSFCell x = sheet.getRow(1).getCell(1); String y = x.toString();
		 * 
		 * XSSFCell a=sheet.getRow(2).getCell(2); String Lastname=x.toString();
		 * 
		 * XSSFCell v=sheet.getRow(3).getCell(3); String Phonenumber=x.toString();
		 * 
		 * System.out.println(y); System.out.println(Lastname);
		 * System.out.println(Phonenumber);
		 * 
		 *//*
			 * FileInputStream fs = new FileInputStream("D:\\TestData\\TestData.xlsx");
			 * XSSFWorkbook wb1 = new XSSFWorkbook(fs); XSSFSheet sheet1 =
			 * wb1.getSheet("Navigation"); int rowcount1; int columcount1; //rowcount1 =
			 * sheet1.getLastRowNum(); XSSFCell x1 = sheet1.getRow(1).getCell(1); String
			 * Salestool = x1.toString().trim(); XSSFCell y1=sheet1.getRow(2).getCell(2);
			 * String buildtool=x1.toString().trim(); XSSFCell
			 * z=sheet1.getRow(3).getCell(3);
			 * 
			 * String addlead=x1.toString().trim(); XSSFCell t=sheet1.getRow(4).getCell(4);
			 * 
			 * String selectlead=x1.toString().trim();
			 * 
			 * System.out.println(Salestool); System.out.println(buildtool);
			 * System.out.println(addlead); System.out.println(selectlead);
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
		
		
		FileInputStream excel=new FileInputStream("D:\\Exceldata\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(excel);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount;
		int columncount;
		rowcount=sheet.getLastRowNum();
		XSSFCell firstname=sheet.getRow(1).getCell(1);
		String fn=firstname.toString().trim();
		XSSFCell lastname=sheet.getRow(2).getCell(1);
		String ln=lastname.toString().trim();
		XSSFCell phonenumber=sheet.getRow(3).getCell(1);
	
		XSSFCell email=sheet.getRow(4).getCell(1);
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(phonenumber);
		System.out.println(email);
		
		

		FileInputStream excel1=new FileInputStream("D:\\Exceldata\\TestData.xlsx");
		XSSFWorkbook workbook1=new XSSFWorkbook(excel1);
		XSSFSheet sheet1=workbook1.getSheetAt(1);
		int rowcount1;
		int columncount1;
		rowcount1=sheet1.getLastRowNum();
		XSSFCell username=sheet1.getRow(1).getCell(1);
		XSSFCell password=sheet1.getRow(2).getCell(1);

		
		System.out.println(username);
		System.out.println(password);
		

		
		
		}
	
	
	
	
	
		
}

