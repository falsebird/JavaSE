package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j
 *(4)PSP��ϷҲ�ǵ�����Ϸ��һ��,��ֻ��ͨ���ֱ��������ϵ���Ϸ,�ܹ��忨,�ܹ���¼��Ϸ,�˳���Ϸ
 */
public class PSP extends OffLineGame {

	private Card card;
	public void screanShot(){
		System.out.println("¼����Ƶ");
	}
	public void insertCard() {
		System.out.println("�Ѳ��룺"+card.getName());
	}
	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		System.out.println("ͨ���ֱ�����:"+ card.getName());
	}
	public void logout(){
		System.out.println("�ǳ���Ϸ");
	}
	public PSP(Card card) {
		super();
		this.card = card;
	}
	public PSP() {
		super();
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}

	
}
