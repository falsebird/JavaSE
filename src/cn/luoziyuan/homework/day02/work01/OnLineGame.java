package cn.luoziyuan.homework.day02.work01;

import java.util.Scanner;

/**
 * @author mr.j
 *(1)������������Ϸ����Ϸ��һ��,������Ϸ����Ϸ����,��Ϸ�˺�,����Ϸ����,���е�¼,�˳�����,
     ��¼��ʱ����Ҫ�ж��û���������,������Ϸ��ͨ�����̺������в�����; 
 */
public class OnLineGame implements Game{
	
	private String name;
	private String account;
	private String password;
	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		System.out.println("ͨ������������");
		
	}
	@SuppressWarnings("resource")
	public boolean login(){
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		name = scanner.nextLine();
		System.out.println("����������");
		password = scanner.nextLine();
		if (name.equals("admin")&&password.equals("admin")) {
			flag = true;
			System.out.println("��¼�ɹ�");
		}
		return flag;
	}
	public void logout(){
		System.out.println("�ǳ���Ϸ");
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
