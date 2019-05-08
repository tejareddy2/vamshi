package vamshi.account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createmainXlsx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    String Name = myObj.nextLine();  // Read user input
	    System.out.println("name is: " + Name);
	    
	 // Creating Workbook instances 
	 		Workbook wb = new HSSFWorkbook(); 

	 		// An output stream accepts output bytes and sends them to sink. 
	 		OutputStream fileOut = new FileOutputStream("excellist/"+Name+".xlsx"); 
	 		
	 		// Creating Sheets using sheet object 
	 		Sheet sheet = wb.createSheet();
	 	
	 		System.out.println("Sheets Has been Created successfully"); 

	 		wb.write(fileOut); 
	}

}
