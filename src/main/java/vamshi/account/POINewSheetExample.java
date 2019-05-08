package vamshi.account;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class POINewSheetExample {
	 public static void main(String[] args) throws IOException {
	 // Create a workbook object.
	 Workbook workbook = new HSSFWorkbook();
	 // Create two sheet by calling createSheet of workbook.
	 workbook.createSheet("dddd");
	 workbook.createSheet("Sheet two2");
	 // Create a FileOutputStream by passing the excel file name.
	 FileOutputStream outputStream = new FileOutputStream("excellist/main.xlsx");
	 // Write the FileOutputStream to workbook object.
	 workbook.write(outputStream);
	 // Finally close the FileOutputStream.
	 outputStream.close();
	 
	 }
	}
