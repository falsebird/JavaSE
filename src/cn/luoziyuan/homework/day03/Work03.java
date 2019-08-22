package cn.luoziyuan.homework.day03;

public class Work03 {

	public static void main(String[] args) {
		long prior = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("我爱你");
		}
		long after = System.currentTimeMillis();
		System.out.println("所用时间为:"+(after - prior));
	}
}
