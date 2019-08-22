package cn.luoziyuan.homework.day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author mr.j
 *1.����Star���������,������ͬ������Ϊ��ͬһ������,�������ɸ�����,ͨ�����ִ�������,
�����Ǵ洢���ʵ��ļ�����,��֤���ǵ�Ψһ��
2.˵��HashSet�ܹ�ȥ�ص�ԭ��;
����:����ӵ�HashSet���ϵ�Ԫ�ض����뼯�������е�Ԫ��һһ�Ƚ�
        ���ȱȽϹ�ϣֵ(ÿ��Ԫ�ض������hashCode()����һ����ϣֵ)
             �������ӵ�Ԫ���뼯�������е�Ԫ�صĹ�ϣֵ����ͬ,����ӵ�Ԫ�ش��뼯��
             �������ӵ�Ԫ���뼯�������е�ĳ��Ԫ�ع�ϣֵ��ͬ,��ʱ����Ҫ����equals(Object obj)�Ƚ�
                   ���equals(Object obj)��������true,˵������ӵ�Ԫ���뼯�������е�ĳ��Ԫ�ص�����ֵ��ͬ,
                   ��ô����ӵ�Ԫ�ز����뼯��
                   ���equals(Object obj)��������false, ˵������ӵ�Ԫ���뼯�������е�Ԫ�ص�����ֵ����ͬ, 
                   ��ô����ӵ�Ԫ�ش��뼯��

 */
public class Work01 {
	public static void main(String[] args) {
		
		Set<Star> stars = new HashSet<Star>();
		getStarts(stars);
		traversal(stars);
	}

	private static void getStarts(Set<Star> stars) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String name = scanner.nextLine();
			stars.add(new Star(name));
		}
		scanner.close();
	}
	public static void traversal(Set<?> sets) {
		
	for (Iterator<?> iterator = sets.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object.toString());
	}
		
	}

}
