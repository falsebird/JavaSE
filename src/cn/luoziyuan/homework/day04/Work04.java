package cn.luoziyuan.homework.day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

/**
 * @author mr.j
 *键盘录入若干个字符串,将字符串存入泛型为String的集合当中, 知道输入quit的时候不用输入;
 1.集合中含有字符a的元素有多少个
 2.将集合中第三个元素中"a"全部替换成"b";
 3.删掉长度为3的元素;
 4.遍历集合;
 */
public class Work04 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		getString(list);
		System.out.println("list中a的数量为"+numsOfAInList(list));
		try{
			exchangAToBInThirdElement(list);
		}catch (NumofListNotEnough e) {
			// TODO: handle exception
			System.out.println("请重新添加元素：");
			getString(list);
			exchangAToBInThirdElement(list);
		}finally {
			System.out.println("将集合中第三个元素中'a'全部替换成b'之后-------------------------------");
			traversal(list);
			deletElementLengthIsThere(list);
			System.out.println(".删掉长度为3的元素之后-------------------------");
			traversal(list);
		}
		
		
		
	}
	
	/**
	 * @param list 获取键盘输入字符串并存入list 当输入quit时退出
	 */
	public static void getString(List<String> list){
		Scanner scanner = new Scanner(System.in);
		while(true){
			String s =scanner.nextLine(); 
			if (s.equals("quit")) {
				break;
			}
			list.add(s);
		}
		scanner.close();
	}
	public static int numsOfAInList(List<String> list){
		int count = 0;
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			count += numsOfAInString(string);
		}
		return count ;
	}
	public static int numsOfAInString(String string){
		char[] ss = string.toCharArray();
		int count = 0;
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] =='a' ) count++;
		}
		return count ;
	}
	public static void exchangAToBInThirdElement(List<String> list){
		if (list.size()<3) {
			throw new RuntimeErrorException(new NumofListNotEnough(), "list中元素个数不足");
		}
		String string = list.get(2);
		char[] ss = string.toCharArray();
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] =='a' ) {
				ss[i] = 'b';
			}
		}
		list.set(2, new String(ss));
	}
	public static void deletElementLengthIsThere(List<String> list){
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (string.length()==3) {
				iterator.remove();
			}
			
		}
	}
	public static void traversal(List<?> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}
}
