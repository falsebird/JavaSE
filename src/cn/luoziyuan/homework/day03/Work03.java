package cn.luoziyuan.homework.day03;

public class Work03 {

	public static void main(String[] args) {
		long prior = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("�Ұ���");
		}
		long after = System.currentTimeMillis();
		System.out.println("����ʱ��Ϊ:"+(after - prior));
	}
}
