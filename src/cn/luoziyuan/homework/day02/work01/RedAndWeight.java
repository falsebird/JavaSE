package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j (3)红白机游戏也是单机游戏的一种,它只能通过手柄操作,能够插卡;
 */
public class RedAndWeight extends OffLineGame {

	private Card card;

	@Override
	public void opreater() {
		// TODO Auto-generated method stub

		System.out.println("只能通过手柄操作");
	}

	public void insertCard() {
		System.out.println("已插入："+card.getName());
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
