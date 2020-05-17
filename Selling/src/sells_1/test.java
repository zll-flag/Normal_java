package sells_1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Sale seller = new Sale();	
		System.out.println("是否买票？（是，输入1；否，输入0）：");
		int flag = s.nextInt();
		while(flag == 1) {
			System.out.println("请输入客户的名字，支付的金钱以及购买票的张数：");
			String name = s.next();
			int money = s.nextInt();
			int n = s.nextInt();
			Buy_tk buyer = new Buy_tk(seller,name,money,n);
			Thread B = new Thread(buyer,name);
			B.start();
			System.out.println("是否买票？（是，输入1；否，输入0）：");
			flag = s.nextInt();
		}
	}
}
