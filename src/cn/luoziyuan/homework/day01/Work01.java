package cn.luoziyuan.homework.day01;

public class Work01 {
	public static void main(String[] args) {
		int x = 10; 
		   int y = x++;
		   int z = x++ + --y + x;//11 + 9+12
		   System.out.println(z);
	}

}
