package cn.luoziyuan.homework.day01;

import java.util.Random;
import java.util.Scanner;

public class Work03 {

	public static void main(String[] args){ 
		Random random = new Random();
		int a = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		System.out.println("������1-100֮�������");
		int count = 0;
		while(true){
			int x = scanner.nextInt();
			count++;
			if (x>a) {
				System.out.println("�������ִ��������");
			}else if(x < a){
				System.out.println("��������С�������");
			}else {
				break;
			}
		}
		System.out.println("��ϲ������ˣ���");
		System.out.println("�²�Ĵ���:"+count);
		scanner.close();
	}
	
}
