package sells_1;

import java.util.Scanner;

public class Sale {
	private int [][]a = {{5,0},{10,0},{20,0},{50,0},{100,0}};
	public Sale() {
		System.out.println("���ʼ����ƱԱ���ϸ���ֵǮ��������");
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; ++i) {
			a[i][1] = sc.nextInt();
		}
	}
	public boolean Sale_tk(int sum,int n) {
		int m = sum - 5*n ;
		if(m < 0)
			return false ;
		else {
			for(int m1 = 0 ; m1 <= a[0][1]; ++m1) {
				for(int m2 = 0 ; m2 <= a[1][1] ; ++m2) {
					for(int m3 = 0 ; m3 <= a[2][1] ; ++m3) {
						for(int m4 = 0 ; m4 <= a[3][1] ; ++m4) {
							if((5*m1 + 10*m2 + 20*m3 + 50*m4) == m) {
								a[0][1] -= m1 ;
								a[1][1] -= m2 ;
								a[2][1] -= m3 ;
								a[3][1] -= m4 ;
								for(int i = 0 ; i < 5 ; ++i) {
									if(a[i][0] == sum)
										a[i][1]++ ;
								}
								System.out.println("��ƱԱ���ϸ���ֵ������    5Ԫ��" + a[0][1] +"  ;10Ԫ��" + a[1][1] +"  ;20Ԫ��" + a[2][1]+"  ;50Ԫ��" + a[3][1]+"  ;100Ԫ��" + a[4][1]);
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}
