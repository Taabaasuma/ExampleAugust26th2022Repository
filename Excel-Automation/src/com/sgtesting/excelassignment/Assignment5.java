package com.sgtesting.excelassignment;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment5 {

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
			sh=wb.createSheet("State Name");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("State1");
			
			//2nd Row
			row=sh.createRow(1);
			cell=row.createCell(1);
			cell.setCellValue("State2");
			
			//3rd Row
			row=sh.createRow(2);
			cell=row.createCell(2);
			cell.setCellValue("State3");
			
			//4th Row
			row=sh.createRow(3);
			cell=row.createCell(3);
			cell.setCellValue("Flower4");
			
			//5th Row
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("State5");
			
			//6th Row
			row=sh.createRow(5);
			cell=row.createCell(5);
			cell.setCellValue("State6");
			
			//7th Row
			row=sh.createRow(6);
			cell=row.createCell(6);
			cell.setCellValue("State7");
			
			//8th Row
			row=sh.createRow(7);
			cell=row.createCell(7);
			cell.setCellValue("State8");
			
			//9th Row
			row=sh.createRow(8);
			cell=row.createCell(8);
			cell.setCellValue("State9");
			
			//10th Row
			row=sh.createRow(9);
			cell=row.createCell(9);
			cell.setCellValue("State10");
			
			//11th Row
			row=sh.createRow(10);
			cell=row.createCell(10);
			cell.setCellValue("State11");
			
			//12th Row
			row=sh.createRow(11);
			cell=row.createCell(11);
			cell.setCellValue("State12");
			
			//13th Row
			row=sh.createRow(12);
			cell=row.createCell(12);
			cell.setCellValue("State13");
			
			//14th Row
			row=sh.createRow(13);
			cell=row.createCell(13);
			cell.setCellValue("State14");
			
			//15th Row
			row=sh.createRow(14);
			cell=row.createCell(14);
			cell.setCellValue("State15");
			
			//16th Row
			row=sh.createRow(15);
			cell=row.createCell(15);
			cell.setCellValue("State16");
			
			//17th Row
			row=sh.createRow(16);
			cell=row.createCell(16);
			cell.setCellValue("State17");
			
			//18th Row
			row=sh.createRow(17);
			cell=row.createCell(17);
			cell.setCellValue("State18");
			
			//19th Row
			row=sh.createRow(18);
			cell=row.createCell(18);
			cell.setCellValue("State19");
			
			//20th Row
			row=sh.createRow(19);
			cell=row.createCell(19);
			cell.setCellValue("State20");
			
			fout=new FileOutputStream("D:\\Excel\\Statename.xlsx");
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
