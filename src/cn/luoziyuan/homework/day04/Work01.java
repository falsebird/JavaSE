package cn.luoziyuan.homework.day04;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author mr.j
 *    (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
    (2)然后利用迭代器和增强for循环分别遍历集合元素并输出
    (3)如：15 18 20 40 46 60 65 70 75 91
 */
public class Work01 {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> arr = new ArrayList<>();
		int count = 0; 
		while(count<10){
			int a = random.nextInt(99)+1;
			if (!isExists(arr, a)) {//当arr中不存在a时将其加入arr之中，并且将计数器+1
				arr.add(a);
				count++;
			}
		}
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
		
		
	}
	/**
	 * @param arr
	 * @param a
	 * @return if arrayList arr exist a
	 */
	public static boolean isExists(ArrayList<Integer> arr , int a ){
		boolean flag = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i)==a) {
				flag = true;
				break;
			}
			
		}
		return flag;
	}
}
