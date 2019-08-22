package cn.luoziyuan.homework.day01;

/**
 * @author mr.j 8.使用静态的特点定义一个工具类专门用于操作数组的, 这个工具类有以下功能 1)可以将整数类型的数组中的最大值找到
 *         2)可以将整数类型的数组中的最小值找到 3)可以遍历一个整数数组; 4)可以求出数组中最大值的角标 5)可以求出数组中最小值的角标;
 *         6)可以对整数类型的数组进行排序
 */
public class Work05 {
	public static void main(String[] args) {
		int[] arr = {12,34,465,3,45};
		sortInsert(arr);
		traversal(arr);
	}

	public static int findMax(int[] a) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > k)
				k = a[i];
		}
		return k;
	}

	public static int findMaxIndex(int[] a) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[k])
				k = i;
		}
		return k;
	}

	public static int findMin(int[] a) {
		int k = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < k)
				k = a[i];
		}
		return k;

	}

	public static int findMinIndex(int[] a) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[k])
				k = i;
		}
		return k;
	}

	public static void traversal(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[a.length - 1] + "]");
	}

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

	public static void exchang(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}
}
