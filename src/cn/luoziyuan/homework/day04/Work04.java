package cn.luoziyuan.homework.day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

/**
 * @author mr.j
 *����¼�����ɸ��ַ���,���ַ������뷺��ΪString�ļ��ϵ���, ֪������quit��ʱ��������;
 1.�����к����ַ�a��Ԫ���ж��ٸ�
 2.�������е�����Ԫ����"a"ȫ���滻��"b";
 3.ɾ������Ϊ3��Ԫ��;
 4.��������;
 */
public class Work04 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		getString(list);
		System.out.println("list��a������Ϊ"+numsOfAInList(list));
		try{
			exchangAToBInThirdElement(list);
		}catch (NumofListNotEnough e) {
			// TODO: handle exception
			System.out.println("���������Ԫ�أ�");
			getString(list);
			exchangAToBInThirdElement(list);
		}finally {
			System.out.println("�������е�����Ԫ����'a'ȫ���滻��b'֮��-------------------------------");
			traversal(list);
			deletElementLengthIsThere(list);
			System.out.println(".ɾ������Ϊ3��Ԫ��֮��-------------------------");
			traversal(list);
		}
		
		
		
	}
	
	/**
	 * @param list ��ȡ���������ַ���������list ������quitʱ�˳�
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
			throw new RuntimeErrorException(new NumofListNotEnough(), "list��Ԫ�ظ�������");
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
