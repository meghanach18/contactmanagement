//package com.example.user.excel;
//
//import java.awt.Font;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.util.List;
//
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//import com.example.user.model.Contact;
//
//public class ExcelGenerator {
//
//	public static ByteArrayInputStream studentToExcel(List<Contact> contact) throws IOException
//	{
//		String[] columns = {"Name","Address","gender","interestedinit","coursesinterested","percentage"};
//		try(
//			Workbook workbook = new XSSFWorkbook();
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			){
//			Sheet sheet = (Sheet) workbook.createSheet("contact");
//			
//			Font headerFont = (Font) workbook.createFont();
//			((org.apache.poi.ss.usermodel.Font) headerFont).setBold(true);
//			((org.apache.poi.ss.usermodel.Font) headerFont).setColor(IndexedColors.BLUE.getIndex());
//			
//			CellStyle headerCellStyle = workbook.createCellStyle();
//			headerCellStyle.setFont((org.apache.poi.ss.usermodel.Font) headerFont);
//			
//			//Row for Header-->
//			Row headerRow = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(0);
//			
//			//Header
//			for(int col=0; col<columns.length; col++)
//			{
//				Cell cell = headerRow.createCell(col);
//				cell.setCellValue(columns[col]);
//				cell.setCellStyle(headerCellStyle);
//			}
//			
//			int rowIdx =1;
//			for(Contact contct: contact)
//			{
//				Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(rowIdx++);
//				
//				row.createCell(0).setCellValue(contct.getName());
//				row.createCell(1).setCellValue(contct.getAddress());
//				row.createCell(2).setCellValue(contct.getGender());
//				row.createCell(2).setCellValue(contct.getCoursesinterested());
//				row.createCell(2).setCellValue(contct.getInterestedinIT());
//				row.createCell(2).setCellValue(contct.getPercentage());
//			}
//			workbook.write(out);
//			return new ByteArrayInputStream(out.toByteArray());
//		}
//	}
//
//	public static ByteArrayInputStream contactToExcel(List<Contact> list) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
