package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j
 *(4)PSP游戏也是单机游戏的一种,它只能通过手柄操作卡上的游戏,能够插卡,能够记录游戏,退出游戏
 */
public class PSP extends OffLineGame {

	private Card card;
	public void screanShot(){
		System.out.println("录制视频");
	}
	public void insertCard() {
		System.out.println("已插入："+card.getName());
	}
	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		System.out.println("通过手柄操作:"+ card.getName());
	}
	public void logout(){
		System.out.println("登出游戏");
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
