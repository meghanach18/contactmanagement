//package com.example.user.excel;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import com.example.user.model.Contact;
//
//public class FileExporter {
//
//	
//	private XSSFWorkbook workbook;
//    private XSSFSheet sheet;
//	private Contact[] listContact;
//   // private List<Contact> listContact;
//     
////    public ContactExcelExporter(List<Contact> listContact) {
////        this.listContact = listContact;
////        workbook = new XSSFWorkbook();
////    }
//// 
//    public void exportToExcel(List<Contact> listContact, HttpServletResponse response) throws IOException{
//    	workbook = new XSSFWorkbook();
//    	setResponseHeader(response,"application/octet-stream",".xlsx", "Contact_");
//    	writeHeaderLine();
//    	writeDataLine(listContact);
//    	ServletOutputStream outStream = response.getOutputStream();
//    	workbook.write(outStream);
//    	workbook.close();
//    	outStream.close();
//    }
// 
//    private void writeDataLine(List<Contact> listContact2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void setResponseHeader(HttpServletResponse response, String string, String string2, String string3) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void writeHeaderLine() {
//        sheet = workbook.createSheet("Contact");
//         
//        XSSFRow row = sheet.createRow(0);
//         
//        XSSFCellStyle style = workbook.createCellStyle();
//        XSSFFont font = workbook.createFont();
//        font.setBold(true);
//        font.setFontHeight(16);
//        style.setFont(font);
//         
//        createCell(row, 0, "ID", style);      
//        createCell(row, 1, "name", style);       
//        createCell(row, 2, "address", style);  
//        createCell(row, 3, "gender", style);  
//        createCell(row, 4, "interestedintit", style);
//        createCell(row, 5, "coursesinterested", style);
//        createCell(row, 6, "percentage", style);  
//         
//    }
//     
//    private void createCell(XSSFRow row, int columnCount, Object value, CellStyle style) {
//        sheet.autoSizeColumn(columnCount);
//        XSSFCell cell = row.createCell(columnCount);
//        if (value instanceof Integer) {
//            cell.setCellValue((Integer) value);
//        } else if (value instanceof Boolean) {
//            cell.setCellValue((Boolean) value);
//        }else {
//            cell.setCellValue((String) value);
//        }
//        cell.setCellStyle(style);
//    }
//     
//    private void writeDataLines() {
//        int rowCount = 1;
// 
//       XSSFCellStyle style = workbook.createCellStyle();
//        XSSFFont font = workbook.createFont();
//        font.setFontHeight(14);
//        style.setFont(font);
//                 
//        for (Contact contact : listContact) {
//            XSSFRow row = sheet.createRow(rowCount++);
//            int columnCount = 0;
//             
//            createCell(row, columnCount++, contact.getId(), style);
//            createCell(row, columnCount++, contact.getName(), style);
//            createCell(row, columnCount++, contact.getAddress(), style);
//            createCell(row, columnCount++, contact.getInterestedinIT().toString(), style);
//            createCell(row, columnCount++, contact.getCoursesinterested(), style);
//            createCell(row, columnCount++, contact.getPercentage(), style);
//             
//        }
//    }
//     
//    public void export(HttpServletResponse response) throws IOException {
//        writeHeaderLine();
//        writeDataLines();
//         
//        ServletOutputStream outputStream = response.getOutputStream();
//        workbook.write(outputStream);
//        workbook.close();
//         
//        outputStream.close();
//         
//    }
//}
