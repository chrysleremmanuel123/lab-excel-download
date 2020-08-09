package service;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.Prograd;

//			Progression -1 
//Go to src/service. Open the ExcelGenerator and fill the logic inside the excelGenerate method.
//
//Stick to the instructions clearly. If you face any issue contact your mentor to get the guidance. 

public class ExcelGenerator {
	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Prograd prograd, List<Prograd> list) throws IOException {
		try {

			XSSFWorkbook xwb = new XSSFWorkbook();
			XSSFSheet sheet=xwb.createSheet("Test");
			for(Prograd listitem:list) {
				int rowcount = 0;
				XSSFRow row = sheet.createRow(++rowcount);
				 int columnCount = 0;
		                	XSSFCell cell1 = row.createCell(++columnCount);
		                    cell1.setCellValue(listitem.getName()); 
		                    XSSFCell cell2 = row.createCell(++columnCount);
		                    cell2.setCellValue(listitem.getId());
		                    XSSFCell cell3 = row.createCell(++columnCount);
		                    cell3.setCellValue(listitem.getRate());
		                    XSSFCell cell4 = row.createCell(++columnCount);
		                    cell4.setCellValue(listitem.getComment());
		                    XSSFCell cell5 = row.createCell(++columnCount);
		                    cell5.setCellValue(listitem.getRecommend());  
			
			// Type your code here
			
		
			}
			String filename = null;
			// Do not modify the lines given below
			 out = new FileOutputStream(filename);
			HSSFWorkbook hwb = null;
			hwb.write(out);
		
			return hwb;
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		finally {
			out.close();
		}
		return null;
		
	}
}
