package com.sgtesting.excelassignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment6 {

	public static void main(String[] args) {
		readContent();
		writeContent();

	}

	private static void readContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try
		{
			fin=new FileInputStream("D:\\Excel\\ReadAndWriteCOuntryname.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int i=0;i<=rc;i++)
			{
				row=sh.getRow(i);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.printf("%-12s",data);
				}
				System.out.println();
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
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
			sh=wb.createSheet("CountryName");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Country1");

			//2nd Row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Country2");

			//3rd Row
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Country3");

			//4th Row
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Country4");

			//5th Row
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Country5");

			//6th Row
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("Country6");

			//7th Row
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("Country7");

			//8th Row
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("Country8");

			//9th Row
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("Country9");

			//10th Row
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Country10");

			//11th Row
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("Country11");

			//12th Row
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("Country12");

			//13th Row
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("Country13");

			//14th Row
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("Country14");

			//15th Row
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("Country15");

			//16th Row
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("Country16");

			//17th Row
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("Country17");

			//18th Row
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("Country18");

			//19th Row
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("Country19");

			//20th Row
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("Country20");

			fout=new FileOutputStream("D:\\\\Excel\\\\ReadAndWriteCOuntryname.xlsx");
			sh=wb.getSheet("Sheet2");
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



