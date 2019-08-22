package cn.luoziyuan.homework.day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author mr.j 1. 组装54张扑克牌 2. 将54张牌顺序打乱 3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。 4.
 *         查看三人各自手中的牌、底牌
 * 
 */
public class Work03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> poker = new ArrayList<>();
		creatPoker(poker);
		Collections.shuffle(poker);
		List<String> gaoziya = new ArrayList<String>();
		List<String> jiashihai = new ArrayList<String>();
		List<String> wangxu = new ArrayList<String>();
		dealCard( poker, gaoziya, jiashihai, wangxu);
		System.out.println("---------------------高紫亚的牌-----------------------");
		traversal(gaoziya);
		System.out.println("---------------------贾世海的牌-----------------------");
		traversal(jiashihai);
		System.out.println("---------------------王旭的牌-----------------------");
		traversal(wangxu);
		System.out.println("---------------------剩下的牌-----------------------");
		traversal(poker, 51, 53);
	}

	private static void dealCard( ArrayList<String> poker, List<String> gaoziya, List<String> jiashihai,
			List<String> wangxu) {
		for (int i = 0; i < poker.size()-3; i++) {
			switch (i % 3) {
			case 0:
				gaoziya.add(poker.get(i));
				break;
			case 1:
				jiashihai.add(poker.get(i));
				break;
			case 2:
				wangxu.add(poker.get(i));
				break;
			}
		}
	}

	private static void creatPoker(List<String> poker) {
		String[] nums = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] flowers = { "黑桃", "红桃", "方片", "梅花" };

		for (int i = 0; i < flowers.length; i++) {
			for (int j = 0; j < nums.length; j++) {

				poker.add(flowers[i] + nums[j]);

			}
		}
		poker.add("大王");
		poker.add("小王");
	}
	public static void traversal(Collection<?> collection) {

		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object.toString());
		}

	}
	public static void traversal(Collection<?> collection ,  int began , int end) {
		int count = 0; 
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (count>=began&&count<=end) {
				System.out.println(object.toString());
			}
			count++;
			
		}

	}

}
