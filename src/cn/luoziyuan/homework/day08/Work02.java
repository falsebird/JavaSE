package cn.luoziyuan.homework.day08;

public class Work02 {
	public static void main(String[] args) {
		MyThread2 jiashihai = new MyThread2(1);
		MyThread2 gaoziya = new MyThread2(2);
		MyThread2 jiaruoqi = new MyThread2(3);
		//jiashihai.setName("jiashihai");
		//gaoziya.setName("gaoziya");
		//jiaruoqi.setName("jiaruoqi");
		//Thread.
		jiashihai.run();
		gaoziya.run();
		jiaruoqi.run();
	}

}
