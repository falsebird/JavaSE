package cn.luoziyuan.homework.day08;

public class Work04 {
	public static void main(String[] args) {
		SaleTicket2 saleTicket1 = new SaleTicket2();
		//SaleTicket saleTicket2 = new SaleTicket();
		//SaleTicket saleTicket3 = new SaleTicket();
		Thread t1 = new Thread(saleTicket1);
		Thread t2 = new Thread(saleTicket1);
		Thread t3 = new Thread(saleTicket1); 
		t1.setName("һ�Ŵ���");
		t2.setName("���Ŵ���");
		t3.setName("���Ŵ���");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
