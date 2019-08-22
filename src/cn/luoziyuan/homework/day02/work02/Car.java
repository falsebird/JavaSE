package cn.luoziyuan.homework.day02.work02;

import java.util.ArrayList;

/**
 * @author mr.j
 *现在有车类,车有轮子,颜色,型号等特性,车可以跑
 */
public class Car {

	private ArrayList<Wheel> Wheels;//轮胎;
	private String model;//型号
	private String color;//颜色
	
	public void run(Driver driver){
		System.out.println("一个叫"+driver.getName()+"驾龄"+driver.getDriveAge()+
				"驾驶一辆"+color+"的"+model+"车子在路上跑");
	}

	public ArrayList<Wheel> getWheels() {
		return Wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		Wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	
}
