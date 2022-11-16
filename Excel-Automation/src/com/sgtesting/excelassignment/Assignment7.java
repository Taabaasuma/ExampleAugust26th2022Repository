package com.sgtesting.excelassignment;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment7 {

	public static void main(String[] args) {
		readContent();

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
			fin=new FileInputStream("D:\\Excel\\FruiteName.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int a=0;a<=rc;a++)
			{
				row=sh.getRow(a);
				int cc=row.getPhysicalNumberOfCells();
				for(int b=0;b<cc;b++)
				{
					cell=row.getCell(b);
					String data=cell.getStringCellValue();
					System.out.printf(data);
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
}

