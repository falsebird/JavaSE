package cn.luoziyuan.homework.day03;

import java.util.Date;

public class Work04 {
	public static void main(String[] args) {
		Date date1 = new Date();
		long d = date1.getTime();
		d +=1000*60*60*24;
		Date date2 = new Date(d);
		System.out.println(date2.toString());
	}
}
