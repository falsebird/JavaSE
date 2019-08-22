package cn.luoziyuan.homework.day08;

public class MyThread2 implements Runnable {

	int num ;
	
	public MyThread2(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +num +"  :"+ i);
		}
	}

}
