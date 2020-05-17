package Test_Excel;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Workbook book = Workbook.getWorkbook(new File("test.xls"));
	            // ��õ�һ�����������
	            Sheet sheet = book.getSheet(0);
	            // �õ���һ�е�һ�еĵ�Ԫ��
	            Cell cell1 = sheet.getCell(0, 0);
	            String result = cell1.getContents();
	            System.out.println(result);
	            book.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}
}
