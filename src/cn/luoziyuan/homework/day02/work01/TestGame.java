package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j
 *  创建测试类,然后创建 网络游戏,登录网络游戏,操作网络游戏,退出网络游戏
		创建电脑单机游戏,操作电脑单机游戏,录制电脑单机游戏
		创建红白机游戏,操作红白机游戏操作插卡的游戏;
		创建PSP单机游戏,操作PSP插卡的游戏,记录游戏,退出游戏;
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
		
		Card card = new Card("超级玛丽");
		
		RedAndWeight redAndWeight = new RedAndWeight(card);
		redAndWeight.opreater();
		PSP psp = new PSP(card);
		psp.opreater();
		psp.screanShot();
		psp.logout();
	}

}
