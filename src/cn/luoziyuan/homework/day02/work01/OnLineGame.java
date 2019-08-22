package cn.luoziyuan.homework.day02.work01;

import java.util.Scanner;

/**
 * @author mr.j
 *(1)现在有网络游戏是游戏的一种,网络游戏有游戏名字,游戏账号,和游戏密码,都有登录,退出功能,
     登录的时候需要判断用户名和密码,网络游戏是通过键盘和鼠标进行操作的; 
 */
public class OnLineGame implements Game{
	
	private String name;
	private String account;
	private String password;
	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘鼠标操作");
		
	}
	@SuppressWarnings("resource")
	public boolean login(){
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		name = scanner.nextLine();
		System.out.println("请输入密码");
		password = scanner.nextLine();
		if (name.equals("admin")&&password.equals("admin")) {
			flag = true;
			System.out.println("登录成功");
		}
		return flag;
	}
	public void logout(){
		System.out.println("登出游戏");
	}
	public OnLineGame(String name) {
		super();
		this.name = name;
	}
	
	public OnLineGame() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
