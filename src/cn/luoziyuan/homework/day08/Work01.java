package cn.luoziyuan.homework.day08;

public class Work01 {

	/**
	 * @param args
	 * ≤‚ ‘÷±Ω”ºÃ≥–Thread¿‡
	 */
	public static void main(String[] args) {
		MyThread jiashihai = new MyThread();
		MyThread gaoziya = new MyThread();
		MyThread jiaruoqi = new MyThread();
		jiashihai.setName("jiashihai");
		gaoziya.setName("gaoziya");
		jiaruoqi.setName("jiaruoqi");
/*		jiashihai.start();
		gaoziya.start();
		jiaruoqi.start();*/
		jiashihai.run();
		gaoziya.run();
		jiaruoqi.run();
	}
}
