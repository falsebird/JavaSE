package cn.luoziyuan.homework.day01;

import java.util.Random;
import java.util.Scanner;

public class Work03 {

	public static void main(String[] args){ 
		Random random = new Random();
		int a = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1-100之间的数字");
		int count = 0;
		while(true){
			int x = scanner.nextInt();
			count++;
			if (x>a) {
				System.out.println("输入数字大于随机数");
			}else if(x < a){
				System.out.println("输入数字小于随机数");
			}else {
				break;
			}
		}
		System.out.println("恭喜你猜中了！！");
		System.out.println("猜测的次数:"+count);
		scanner.close();
	}
	
}
