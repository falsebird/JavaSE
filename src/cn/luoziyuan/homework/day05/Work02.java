package cn.luoziyuan.homework.day05;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Work02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取一个collection对象
		Collection<Integer> collection = new LinkedList<Integer>();
		//加入一组20个的随机数
		for (int i = 0; i < 20; i++) {
			collection.add(getRandomNum());
		}
		System.out.println("--------------------------排序之前：-----------------------");
		traversal(collection);
		
		InsertSort(collection);
		System.out.println("-----------------------------排序之后：-----------------------");
		traversal(collection);
	}

	/**
	 * @param collection
	 * 插入排序
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
	 * 将arr中所有元素添加到collection中
	 */
	private static void addAll(Collection<Integer> collection, Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			collection.add(arr[i]);
		}
	}
	/**
	 * @param a
	 * 插入排序
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
	 * 获取一个随机数
	 */
	private static int getRandomNum() {
		Random random = new Random();
		int a = random.nextInt(100);
		return a;
	}
	/**
	 * @param collection
	 * 遍历一个collection对象
	 */
	public static void traversal(Collection<?> collection) {

		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object.toString());
		}

	}
}
