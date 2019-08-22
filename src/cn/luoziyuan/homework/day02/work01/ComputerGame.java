package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j
 *)现在有电脑单机游戏也是单机游戏的一种,电脑单机游戏是可以通过键盘和鼠标操作,
     但是也可以通过手柄操作,还可以录制视频;
 */
public class ComputerGame extends OffLineGame {
	private String name;
	public ComputerGame(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	public ComputerGame() {
		super();
	}


	public void screanShot(){
		System.out.println("录制视频");
	}

	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		
		System.out.println("通过键盘鼠标操作,但是也可以通过手柄操作");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
