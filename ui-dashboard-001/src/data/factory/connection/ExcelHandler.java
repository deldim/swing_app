/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.factory.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Vector;
import org.apache.poi.ss.util.CellUtil;


public class ExcelHandler  {  
	  
    
    public static ArrayList<Vector> load(String fileLocation) throws IOException   {  
    	FileInputStream file = new FileInputStream(new File(fileLocation));
    	XSSFWorkbook workbook = new XSSFWorkbook(file);
    	XSSFSheet sheet = workbook.getSheetAt(0);
    	Iterator<Row> rowIterator = sheet.iterator();
        ArrayList<Vector> array = new ArrayList<Vector>();
    	while (rowIterator.hasNext()) {
    	  Row row = rowIterator.next();
          Vector r = new Vector();
          String table_schema= CellUtil.getCell(row, 0).getStringCellValue();
          String table_name=CellUtil.getCell(row, 1).getStringCellValue();
          String column_name=CellUtil.getCell(row, 2).getStringCellValue();
          String column_filter=CellUtil.getCell(row, 3).getStringCellValue();
          String own_cd=CellUtil.getCell(row, 4).getStringCellValue();
          String read_rolename=CellUtil.getCell(row, 5).getStringCellValue();
          String is_enabled=CellUtil.getCell(row, 6).getStringCellValue();
          String desc=CellUtil.getCell(row, 7).getStringCellValue();
          r.add(table_schema);
          r.add(table_name);
          r.add(column_name);
          r.add(column_filter);
          r.add(own_cd);
          r.add(read_rolename);
          r.add(is_enabled);
          r.add(desc);
          array.add(r);
    	}
    	file.close();
        System.out.println(array.toString());
        return array;
    }  
    
    public static void main(String args[]) throws IOException {
    	ExcelHandler.load("/Users/macintosh/Desktop/Classeur1.xlsx");
    }
}  
