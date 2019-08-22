package cn.luoziyuan.homework.day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mr.j
 *(1)����List���ϣ��������ַ���
    (2)ɾ������Ԫ���ַ����а���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
    (3)Ȼ�����õ�������������Ԫ�ز����
    δ��ɣ����������
    
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
		//String regex = new String("[0-9][a-zA-Z_0-9]*");//�����ڿ�ͷ
		String regex2 = new String("[a-zA-Z_0-9]*[0-9][a-zA-Z_0-9]*");//�������м�
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
