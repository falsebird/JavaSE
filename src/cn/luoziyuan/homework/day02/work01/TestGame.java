package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j
 *  ����������,Ȼ�󴴽� ������Ϸ,��¼������Ϸ,����������Ϸ,�˳�������Ϸ
		�������Ե�����Ϸ,�������Ե�����Ϸ,¼�Ƶ��Ե�����Ϸ
		������׻���Ϸ,������׻���Ϸ�����忨����Ϸ;
		����PSP������Ϸ,����PSP�忨����Ϸ,��¼��Ϸ,�˳���Ϸ;
 */
public class TestGame {
	
	public static void main(String[] args) {
		OnLineGame onLineGame = new OnLineGame("lol");
		onLineGame.login();
		onLineGame.opreater();
		onLineGame.logout();
		
		ComputerGame computerGame = new ComputerGame("bigpig");
		computerGame.opreater();
		computerGame.screanShot();
		
		Card card = new Card("��������");
		
		RedAndWeight redAndWeight = new RedAndWeight(card);
		redAndWeight.opreater();
		PSP psp = new PSP(card);
		psp.opreater();
		psp.screanShot();
		psp.logout();
	}

}
