package sells_1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Sale seller = new Sale();	
		System.out.println("�Ƿ���Ʊ�����ǣ�����1��������0����");
		int flag = s.nextInt();
		while(flag == 1) {
			System.out.println("������ͻ������֣�֧���Ľ�Ǯ�Լ�����Ʊ��������");
			String name = s.next();
			int money = s.nextInt();
			int n = s.nextInt();
			Buy_tk buyer = new Buy_tk(seller,name,money,n);
			Thread B = new Thread(buyer,name);
			B.start();
			System.out.println("�Ƿ���Ʊ�����ǣ�����1��������0����");
			flag = s.nextInt();
		}
	}
}
