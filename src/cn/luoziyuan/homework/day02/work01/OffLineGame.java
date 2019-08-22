package cn.luoziyuan.homework.day02.work01;

public class OffLineGame implements Game {

	private String name;
	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		System.out.println("¿ÉÒÔ²Ù×÷");
	}
	public OffLineGame(String name) {
		super();
		this.name = name;
	}
	public OffLineGame() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
