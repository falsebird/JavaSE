package cn.luoziyuan.homework.day08;

public class SaleTicket2  implements Runnable{

	static int tickets = 100;
	Object obj = new Object();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			method();
			
		}
	}
	private static  synchronized void method() {
		if (tickets > 0) {
           
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}

	
	
	
}
