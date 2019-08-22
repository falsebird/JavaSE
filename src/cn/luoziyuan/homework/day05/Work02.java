package cn.luoziyuan.homework.day05;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Work02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡһ��collection����
		Collection<Integer> collection = new LinkedList<Integer>();
		//����һ��20���������
		for (int i = 0; i < 20; i++) {
			collection.add(getRandomNum());
		}
		System.out.println("--------------------------����֮ǰ��-----------------------");
		traversal(collection);
		
		InsertSort(collection);
		System.out.println("-----------------------------����֮��-----------------------");
		traversal(collection);
	}

	/**
	 * @param collection
	 * ��������
	 */
	private static void InsertSort(Collection<Integer> collection) {
		Integer[] arr = new Integer[collection.size()];
		collection.toArray(arr);
		Integer   temp = 0;
		for (int i = 1; i < arr.length; i++) {
			temp  = arr[i];
			int j  = i;
			for (j= i; j > 0&&arr[j-1] >temp; j--) {
					arr[j] = arr[j-1];
			}
			arr[j] = temp;
		}
		collection.removeAll(collection);
		addAll(collection, arr);
	}

	/**
	 * @param collection
	 * @param arr
	 * ��arr������Ԫ����ӵ�collection��
	 */
	private static void addAll(Collection<Integer> collection, Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			collection.add(arr[i]);
		}
	}
	/**
	 * @param a
	 * ��������
	 */
	public static void sortInsert(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			temp =a[i];
			int j = 0; 
			for ( j = i; j >0&&temp < a[j-1]; j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}

	/**
	 * @return
	 * ��ȡһ�������
	 */
	private static int getRandomNum() {
		Random random = new Random();
		int a = random.nextInt(100);
		return a;
	}
	/**
	 * @param collection
	 * ����һ��collection����
	 */
	public static void traversal(Collection<?> collection) {

		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object.toString());
		}

	}
}
