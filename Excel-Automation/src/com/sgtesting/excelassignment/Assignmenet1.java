package com.sgtesting.excelassignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignmenet1 {

	public static void main(String[] args) {
		writeContent();

	}

	private static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Flower Name");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Flower1");
			
			//2nd Row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Flower2");
			
			//3rd Row
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Flower3");
			
			//4th Row
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Flower4");
			
			//5th Row
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Flower5");
			
			//6th Row
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("Flower6");
			
			//7th Row
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("Flower7");
			
			//8th Row
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("Flower8");
			
			//9th Row
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("Flower9");
			
			//10th Row
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Flower10");
			
			//11th Row
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("Flower11");
			
			//12th Row
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("Flower12");
			
			//13th Row
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("Flower13");
			
			//14th Row
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("Flower14");
			
			//15th Row
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("Flower15");
			
			//16th Row
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("Flower16");
			
			//17th Row
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("Flower17");
			
			//18th Row
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("Flower18");
			
			//19th Row
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("Flower19");
			
			//20th Row
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("Flower20");
			
			fout=new FileOutputStream("D:\\Excel\\Flowername.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}


	}

}
