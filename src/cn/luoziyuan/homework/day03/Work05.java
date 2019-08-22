package cn.luoziyuan.homework.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Work05 {
	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat sDateFormat =  new SimpleDateFormat(" yyyy年MM月dd日 HH:mm:ss");//第一个格式化
		 SimpleDateFormat sDateFormat2 =  new SimpleDateFormat("yyyy_MM_dd#####HH-mm-ss");//第二个格式化
		Date date1 = new Date();//测试第一个格式化
		String fdate = sDateFormat.format(date1);
		System.out.println(fdate);
		String  date = "2000_02_29#####23-23-23";//
		Date date2 = sDateFormat2.parse(date);
		long d = date2.getTime();
		d +=1000*60*60*24;
		Date date3 = new Date(d);
		String fdate2 = sDateFormat.format(date3);
		System.out.println(fdate2);
	}

}
