package cn.luoziyuan.homework.day08;

/**
 * @author mr.j
 *使用syncheonized关键字修饰代码块
 *注意被锁代码块需要共享同一个线程对象
 */
public class SaleTicket  implements Runnable{

	int ticket = 100;
	Object obj = new Object();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (obj) {//该对象需要呗所有线程共享，就是要使用同一个对象
				if (ticket>0) {
					 try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 System.out.println(Thread.currentThread().getName() +": "+ ticket--);
				}else {
					break;
				}
			}
			
		}
	}

	
	
	
}
