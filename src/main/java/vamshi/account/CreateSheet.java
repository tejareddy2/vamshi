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

public class CreateSheet{

	public static void main(String[] args) throws IOException {

		Scanner myObj = new Scanner(System.in); 
	    
		final String FILE_NAME = "excellist/main.xlsx"; 
	    InputStream inp = new FileInputStream(FILE_NAME); 
	    Workbook wb =new HSSFWorkbook(inp);
	 		
		    System.out.println("Enter Farmer name");
		    String Farmer_name = myObj.nextLine();  
		    System.out.println("Farmer name is: " + Farmer_name);
		    

		    Sheet sheet = wb.createSheet(Farmer_name);
		    System.out.println(sheet.getSheetName());
	 		Row header1 = sheet.createRow(1);
	 		header1.createCell(0).setCellValue("Name : ");
	 	    header1.createCell(1).setCellValue(Farmer_name);
	 		
	 	    header1.createCell(3).setCellValue("Village : ");
	 		System.out.println("Enter Village name");
		    // Read user input
		    String Village = myObj.nextLine();  
		    System.out.println("Village name is: " + Village);
	 	    header1.createCell(4).setCellValue(Village);
	 		
	 	    
	 	    Row header2 = sheet.createRow(2);
	 	    header2.createCell(0).setCellValue("Phone number : ");
	 	    System.out.println("Enter Phone number");
		    // Read user input
		    String Phone_number = myObj.nextLine();  
		    System.out.println("Phone number is: " + Phone_number);
		    header2.createCell(1).setCellValue(Phone_number);
		    
		    header2.createCell(3).setCellValue("Seed Veriety : ");
	 	    System.out.println("Enter Seed Veriety");
		    // Read user input
		    String Seed_Veriety = myObj.nextLine();  
		    System.out.println("Seed Veriety is: " + Seed_Veriety);
		    header2.createCell(4).setCellValue(Seed_Veriety);
		    
		  
		    
	 	    Row header5 = sheet.createRow(5);
	 	    header5.createCell(0).setCellValue("Date");
	 	    header5.createCell(1).setCellValue("Amount");
		   

	 		

	 	    System.out.println("Sheets Has been Created successfully"); 
	 	 
	 	   // Now this Write the output to a file 
		    FileOutputStream fileOut = new FileOutputStream(FILE_NAME); 
		    wb.write(fileOut); 
		    fileOut.close(); 
		    
	}

}
