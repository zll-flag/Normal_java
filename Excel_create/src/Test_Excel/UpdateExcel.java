package Test_Excel;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import java.io.File;
import java.io.IOException;
public class UpdateExcel {
	public static void main(String[] args) throws RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		WritableWorkbook book;
		try {
			book = Workbook.createWorkbook(new File("test.xls"));
			// ������Ϊ����һҳ���Ĺ�����������0��ʾ���ǵ�һҳ
	        WritableSheet sheet = book.createSheet("��һҳ", 0);
	        //�����ͷ
	        sheet.mergeCells(0, 0, 7, 0);//���Ӻϲ���Ԫ��
	        WritableFont bold1 = new WritableFont(WritableFont.ARIAL, 15);//������������ͺ�����ʾ
	        WritableCellFormat titleFormate = new WritableCellFormat (bold1);
	        WritableCellFormat format1 = new WritableCellFormat ();
	        WritableCellFormat format2 = new WritableCellFormat ();
	        titleFormate.setAlignment(jxl.format.Alignment.CENTRE);//��Ԫ���е�����ˮƽ�������
	        titleFormate.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);//��Ԫ���е����ݴ�ֱ�������
	        format1.setAlignment(jxl.format.Alignment.CENTRE);//��Ԫ���е�����ˮƽ�������
	        format1.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);//��Ԫ���е����ݴ�ֱ�������
	        format2.setAlignment(jxl.format.Alignment.CENTRE);//��Ԫ���е����ݴ�ֱ�������
	        Label title = new Label(0,0,"��ְ����",titleFormate);
	        sheet.setRowView(0,600,false);//���õ�һ�еĸ߶�
	        sheet.addCell(title);
	        sheet.mergeCells(1, 3, 5, 3);
	        sheet.mergeCells(0, 7, 7, 7);
	        sheet.mergeCells(6, 1, 7, 6);
	        sheet.mergeCells(0, 8, 7, 17);
	        sheet.mergeCells(0, 18, 7, 18);
	        sheet.mergeCells(0, 19, 7, 30);
	        Label b = new Label(0, 18, "ר��",format1);
			sheet.addCell(b);
			Label b1 = new Label(6, 1, "��Ƭ",format2);
			sheet.addCell(b1);
	        Label a = new Label(0, 7, "���˼��",format1);
			sheet.addCell(a);
			Label a1 = new Label(0, 2, "��������");
			sheet.addCell(a1);
			Label a2 = new Label(2, 2, "����");
			sheet.addCell(a2);
			Label a3 = new Label(2, 1, "�Ա�");
			sheet.addCell(a3);
			Label a4 = new Label(4, 2, "����");
			sheet.addCell(a4);
			Label a5 = new Label(4, 1, "����");
			sheet.addCell(a5);
			Label a6 = new Label(0, 1, "����");
			sheet.addCell(a6);
			Label a7 = new Label(0, 3, "��ͥסַ");
			sheet.addCell(a7);
			Label a8 = new Label(0, 4, "������ò");
			sheet.addCell(a8);
			Label a9 = new Label(2, 4, "�绰");
			sheet.addCell(a9);
			Label a10 = new Label(4, 4, "רҵ");
			sheet.addCell(a10);
			book.write();
            book.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}