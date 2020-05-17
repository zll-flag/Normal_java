package fanxing1_shuzu;

import java.util.Arrays;

public class Shuzu <T extends Comparable>{
	private T a[] ;
	public Shuzu(T A[]) {
		a = A ;
	}
	public <T extends Comparable> void Print() {
		for(int i = 0 ; i < a.length ; ++i) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public <T extends Comparable> void sort() {
		Arrays.sort(a);
	}
	public <T extends Comparable> boolean Find(T t) {
		for(int i = 0 ; i < a.length ; ++i) {
			if(t.compareTo(a[i]) == 0) {
				System.out.println("找到了！");
				return true ;
			}
		}
		System.out.println("没找到！");
		return false;
	}
	public <T extends Comparable> T Max() {
		T max = (T) a[0];
		int dex ;
		for(int i = 1 ; i < a.length ; ++i) {
			if(max.compareTo(a[i]) < 0) {
				max = (T) a[i] ;
				dex = i ;
			}
		}
		return max ; 
	}
	public <T extends Comparable> T Min() {
		T min = (T) a[0];
		int dex ;
		for(int i = 1 ; i < a.length ; ++i) {
			if(min.compareTo(a[i]) > 0) {
				min = (T) a[i] ;
				dex = i ;
			}
		}
		return min ; 
	}
}
