package vamshi.account;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException{
		System.out.println("hi");
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Farmer name");
	    // Read user input
	    String name = myObj.nextLine();  
	    System.out.println("Farmer name is: " + name);
	    
		final String FILE_NAME = "./excellist/main.xlsx"; 
	    InputStream inp = new FileInputStream(FILE_NAME); 
	    Workbook wb =new HSSFWorkbook(inp);
	    Sheet sheet = wb.getSheet(name);
	 // Iterate through each rows one by one 
        Iterator<Row> rowIterator = sheet.iterator(); 
        while (rowIterator.hasNext()) { 
            Row row = rowIterator.next(); 
            // For each row, iterate through all the columns 
            Iterator<Cell> cellIterator = row.cellIterator(); 

            while (cellIterator.hasNext()) { 
                Cell cell = cellIterator.next(); 
                // Check the cell type and format accordingly 
                switch (cell.getCellType()) { 
                case Cell.CELL_TYPE_NUMERIC: 
                    System.out.print(cell.getNumericCellValue() + "\t"); 
                    break; 
                case Cell.CELL_TYPE_STRING: 
                    System.out.print(cell.getStringCellValue() + "\t"); 
                    break; 
                } 
            } 
			System.out.println();
			}
		}

}
