package cn.luoziyuan.homework.day02.work01;

/**
 * @author mr.j
 *)�����е��Ե�����ϷҲ�ǵ�����Ϸ��һ��,���Ե�����Ϸ�ǿ���ͨ�����̺�������,
     ����Ҳ����ͨ���ֱ�����,������¼����Ƶ;
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
		System.out.println("¼����Ƶ");
	}

	@Override
	public void opreater() {
		// TODO Auto-generated method stub
		
		System.out.println("ͨ������������,����Ҳ����ͨ���ֱ�����");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
