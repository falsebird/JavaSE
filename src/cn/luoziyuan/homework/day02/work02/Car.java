package cn.luoziyuan.homework.day02.work02;

import java.util.ArrayList;

/**
 * @author mr.j
 *�����г���,��������,��ɫ,�ͺŵ�����,��������
 */
public class Car {

	private ArrayList<Wheel> Wheels;//��̥;
	private String model;//�ͺ�
	private String color;//��ɫ
	
	public void run(Driver driver){
		System.out.println("һ����"+driver.getName()+"����"+driver.getDriveAge()+
				"��ʻһ��"+color+"��"+model+"������·����");
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
