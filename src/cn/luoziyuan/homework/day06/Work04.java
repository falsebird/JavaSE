package cn.luoziyuan.homework.day06;

public class Work04 {
	/**
	 * @param args
	 * 5.定义Student类,里面有姓名,年龄,JavaStudent是Student的子类, 请在创建JavaStudent的时候给姓名年龄进行赋值;  
	 * 当父类只有带有属性的构造方法时候，子类必须覆盖对应的方法
	 */
	public static void main(String[] args) {
		JavaStudent javaStudent = new JavaStudent("贾世海", 22);
		System.out.println(javaStudent.toString());
	}

}
