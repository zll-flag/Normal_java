package fanxing1_shuzu;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []a = {8, 6, 19,33 , 0 ,2} ;
		Shuzu<Integer> arr = new Shuzu<Integer>(a);
		arr.Find(11);
		System.out.println("���ֵ��" + arr.Max());
		System.out.println("��Сֵ��" + arr.Min());
		arr.sort();
		arr.Print();
	}
}
