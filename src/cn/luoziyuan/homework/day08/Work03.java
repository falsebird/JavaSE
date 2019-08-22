package cn.luoziyuan.homework.day08;

public class Work03 {
	public static void main(String[] args) {
		SaleTicket saleTicket1 = new SaleTicket();
		//SaleTicket saleTicket2 = new SaleTicket();
		//SaleTicket saleTicket3 = new SaleTicket();
		Thread t1 = new Thread(saleTicket1);
		Thread t2 = new Thread(saleTicket1);
		Thread t3 = new Thread(saleTicket1); 
		t1.setName("一号窗口");
		t2.setName("二号窗口");
		t3.setName("三号窗口");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
