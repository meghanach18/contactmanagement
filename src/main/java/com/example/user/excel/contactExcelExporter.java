package com.example.user.excel;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.user.model.Contact;

public class contactExcelExporter {
	 private XSSFWorkbook workbook;
	    private XSSFSheet sheet;
	    private List<Contact> listContact;
	     
	    public contactExcelExporter(List<Contact> listContact) {
	        this.listContact = listContact;
	        workbook = new XSSFWorkbook();
	    }
	 
	 
	    private void writeHeaderLine() {
	        sheet = workbook.createSheet("Users");
	         
	        Row row = sheet.createRow(0);
	         
	        CellStyle style = workbook.createCellStyle();
	        XSSFFont font = workbook.createFont();
	        font.setBold(true);
	        font.setFontHeight(16);
	        style.setFont(font);
	         
	        createCell(row, 0, " ID", style);      
	        createCell(row, 1, "name", style);       
	        createCell(row, 2, "age", style); 
	        createCell(row, 3, "address", style);
	        createCell(row, 4, "gender", style);
	        createCell(row, 5, "interestedint", style);
	        createCell(row, 6, "courseinterested", style);
	        createCell(row, 7, "percentage", style);
	        createCell(row, 8, "percentageinwords", style);
	        createCell(row, 9, "ip", style);
	        createCell(row, 10, "location", style);
	    }
	     
	    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
	        sheet.autoSizeColumn(columnCount);
	        Cell cell = row.createCell(columnCount);
	        if (value instanceof Integer) {
	            cell.setCellValue((Integer) value);
	        
	        }else {
	            cell.setCellValue((String) value);
	        }
	        cell.setCellStyle(style);
	    }
	     
	    private void writeDataLines() {
	        int rowCount = 1;
	 
	        CellStyle style = workbook.createCellStyle();
	        XSSFFont font = workbook.createFont();
	        font.setFontHeight(14);
	        style.setFont(font);
	                 
	        for (Contact user : listContact) {
	            Row row = sheet.createRow(rowCount++);
	            int columnCount = 0;
	             
	            createCell(row, columnCount++, user.getId(), style);
	            createCell(row, columnCount++, user.getName(), style);
	            createCell(row, columnCount++, user.getAddress(), style);
	            createCell(row, columnCount++, user.getCoursesinterested(), style);
	            createCell(row, columnCount++, user.getInterestedinIT(), style);
	            createCell(row, columnCount++, user.getPercentage(), style);
	            createCell(row, columnCount++, user.getPercentageinWords(), style);
	            createCell(row, columnCount++, user.getIp(), style);
	        }
	    }
	     
	    public void export(HttpServletResponse response) throws IOException {
	        writeHeaderLine();
	        writeDataLines();
	         
	        ServletOutputStream outputStream = response.getOutputStream();
	        workbook.write(outputStream);
	        workbook.close();
	         
	        outputStream.close();
	         
	    }
}
