package cn.luoziyuan.homework.day01;

import java.util.Scanner;

public class Work02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int a = scanner.nextInt();
		System.out.println("��������һ������");
		int b = scanner.nextInt();
		scanner.close();
		boolean flag= isequal(a, b);
		System.out.println(flag);
		
	}
	
	public static boolean isequal(int x, int y){
		Boolean flag= false;
		if (x==y) {
			flag = true;
		}
		return flag;
	}

}
