package Test_Excel;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreateExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // ���ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("test.xls"));
            // ������Ϊ����һҳ���Ĺ���������0��ʾ���ǵ�һҳ
            WritableSheet sheet = book.createSheet("��һҳ", 0);
            // ��Label����Ĺ�������ָ����Ԫ��λ���ǵ�һ�е�һ��(0,0)
            // �Լ���Ԫ������Ϊtest
            Label label = new Label(0, 0, "test");

            // ������õĵ�Ԫ����ӵ���������
            sheet.addCell(label);

            /*
             * ����һ���������ֵĵ�Ԫ�� ����ʹ��Number��������·�����������﷨���� ��Ԫ��λ���ǵڶ��У���һ�У�ֵΪ789.123
             */
            jxl.write.Number number = new jxl.write.Number(1, 0, 555.12541);
            sheet.addCell(number);

            // д�����ݲ��ر��ļ�
            book.write();
            book.close();

        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
