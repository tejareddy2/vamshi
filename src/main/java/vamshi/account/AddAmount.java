package vamshi.account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddAmount {
	public static void main(String[] args) throws IOException {
		
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter username");
	    String Name = myObj.nextLine();  
	    System.out.println("name is: " + Name);
	    
		final String FILE_NAME = "C:\Users\teja\Desktop\main.xlsx"; 
	    InputStream inp = new FileInputStream(FILE_NAME); 
	    Workbook wb =new HSSFWorkbook(inp);
	    Sheet sheet = wb.getSheet(Name);
	    int num = sheet.getLastRowNum(); 
	    Row row = sheet.createRow(++num);
	    
	    System.out.println("Enter date");
	    String Date = myObj.nextLine();  
	    System.out.println("Date is: " + Date);
	    row.createCell(0).setCellValue(Date); 
	    
	    System.out.println("Enter Amount");
	    String Amount = myObj.nextLine();  
	    System.out.println("Amount is: " + Amount);
	    row.createCell(0).setCellValue(Date);
	    row.createCell(1).setCellValue(Amount); 
	        
	    // Now this Write the output to a file 
	    FileOutputStream fileOut = new FileOutputStream(FILE_NAME); 
	    wb.write(fileOut); 
	    fileOut.close(); 
	}

}
