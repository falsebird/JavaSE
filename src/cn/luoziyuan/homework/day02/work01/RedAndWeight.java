package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j (3)��׻���ϷҲ�ǵ�����Ϸ��һ��,��ֻ��ͨ���ֱ�����,�ܹ��忨;
 */
public class RedAndWeight extends OffLineGame {

	private Card card;

	@Override
	public void opreater() {
		// TODO Auto-generated method stub

		System.out.println("ֻ��ͨ���ֱ�����");
	}

	public void insertCard() {
		System.out.println("�Ѳ��룺"+card.getName());
	}

	public RedAndWeight(Card card) {
		super();
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public RedAndWeight() {
		super();
	}
}
