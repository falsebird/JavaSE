package cn.luoziyuan.homework.day03;

public class Work02 {
	public static void main(String[] args) {
		int [] arr ={12,234,45,324};
		int[] arr2 = new int[2];
		System.arraycopy(arr, 1, arr2	, 0, 2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
