package stevejobs;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;

public class Test104
{
	public static void main(String[] args) throws Exception
	{
		//Open Excel file for test data reading
		File f=new File("sample.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0); //0 for Sheet1
		int nour=rsh.getRows();
		//Open same excel file for results writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(1);//1 for Sheet2
		//Perform addition
		//first row(index is 0) have names of columns
		for(int i=1;i<nour;i++)
		{
			int x=Integer.parseInt(rsh.getCell(0,i).getContents());
			int y=Integer.parseInt(rsh.getCell(1,i).getContents());
			int z=x+y;
			Number n=new Number(0,i,z);
			wsh.addCell(n);	
		}
		//Save and close excel
		wwb.write();
		wwb.close();
		rwb.close();
	}
}






