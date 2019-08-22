package cn.luoziyuan.homework.day01;

/**
 * @author mr.j 8.ʹ�þ�̬���ص㶨��һ��������ר�����ڲ��������, ��������������¹��� 1)���Խ��������͵������е����ֵ�ҵ�
 *         2)���Խ��������͵������е���Сֵ�ҵ� 3)���Ա���һ����������; 4)����������������ֵ�ĽǱ� 5)���������������Сֵ�ĽǱ�;
 *         6)���Զ��������͵������������
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
