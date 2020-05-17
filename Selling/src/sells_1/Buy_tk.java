package sells_1;

public class Buy_tk implements Runnable{
	private String name;
	private int sum_money;
	private int num ;
	private Sale saler = null ;
	public Buy_tk(Sale s , String n , int money,int nu) {
		saler = s ;
		name = n ;
		sum_money = money ;
		num = nu ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			boolean bool = saler.Sale_tk(sum_money,num);
			int flag = 1 ;
			while(flag == 1) {
				if(bool) {
					System.out.println(Thread.currentThread().getName()+"³É¹¦¹ºÂò£¡");
					flag = 0 ;
					super.notifyAll();					
				}
				else {
					System.out.println(Thread.currentThread().getName() + " is waiting£¡");
					try {
						super.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
