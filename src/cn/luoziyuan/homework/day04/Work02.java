package cn.luoziyuan.homework.day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mr.j
 *(1)定义List集合，存入多个字符串
    (2)删除集合元素字符串中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
    (3)然后利用迭代器遍历集合元素并输出
    未完成，后边再来整
    
 */
public class Work02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new  LinkedList<String>();
		addElement(list);
		traversal(list);
		removeStringWithNum(list);
		System.out.println();
		traversal(list);
		
	}
	private static void removeStringWithNum(List<String> list) {
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (isHaveNumber(string)) {
				iterator.remove();
			}
		}
	}
	public  static boolean isHaveNumber(String s){
		//String regex = new String("[0-9][a-zA-Z_0-9]*");//数字在开头
		String regex2 = new String("[a-zA-Z_0-9]*[0-9][a-zA-Z_0-9]*");//数字在中间
		boolean flag = false;
		flag = s.matches(regex2);
				
		return flag;
		
	}
	
	
	
	
	public  static void addElement(List<String> list){
		list.add("jiashihai");
		list.add("1jiashihai");
		list.add("jiashi2hai");
		list.add("jiashihai23234");
		list.add("01jias2323hihai");
		list.add("jiash2323ihai7ji");
		list.add("jiashihai89");
		list.add("jiashi@hai");

	}
	public static void traversal(List<?> list) {
		System.out.print("[ ");
		for (int i = 0; i < list.size()-1; i++) {
			System.out.print(list.get(i).toString() + ",");
		}
		System.out.print(list.get(list.size()-1).toString() + "]");
	}

	

}
