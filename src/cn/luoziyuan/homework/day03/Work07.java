package cn.luoziyuan.homework.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Work07 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sDateFormat =  new SimpleDateFormat("yyyy-MM-dd");//第一个格式化
		Date now = new Date();
		System.out.println("请按照格式”xxxx-xx-xx“输入您的生日");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		scanner.close();
		Date  birth = sDateFormat.parse(date);
		long length = (now.getTime()-birth.getTime())/(1000*60*60*24);
		System.out.println("您从出生到现在总共活了"+length+"天");
		
	}
}
