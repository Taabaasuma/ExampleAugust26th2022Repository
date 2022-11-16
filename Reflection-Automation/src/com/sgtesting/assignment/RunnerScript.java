package com.sgtesting.assignment;

import java.io.FileInputStream;      
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class RunnerScript {

	public static void main(String[] args) {
		executeMethods();

	}
	public static void executeMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			String sheets[]= {"Sheet1","Sheet2","Sheet3","Sheet4","Sheet5","Sheet6","Sheet7","Sheet8"};
			for(int j=0;j<sheets.length;j++)
			{
			fin=new FileInputStream(".\\DataFile\\Reflection-Automation.xlsx");
			wb=new XSSFWorkbook(fin);
			
			System.out.println(sheets[j]);
			sh=wb.getSheet(sheets[j]);
			
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				System.out.println(methodname+ " --->"+pkgclassname);
				
				Class clsObject=Class.forName(pkgclassname);
				Object obj=clsObject.getConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
