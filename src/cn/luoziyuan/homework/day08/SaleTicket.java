package cn.luoziyuan.homework.day08;

/**
 * @author mr.j
 *ʹ��syncheonized�ؼ������δ����
 *ע�ⱻ���������Ҫ����ͬһ���̶߳���
 */
public class SaleTicket  implements Runnable{

	int ticket = 100;
	Object obj = new Object();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (obj) {//�ö�����Ҫ�������̹߳�������Ҫʹ��ͬһ������
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
