package cn.luoziyuan.homework.day01;

/**
 * @author mr.j
 *
 *这里有大问题
 */
public class Work04 {

	public static void main(String[] args) {
		int[] arr = {12,34,465,3,45};//最初的数组
		int[] b = new int[arr.length];
		reverse(arr, b);
		//新创建一个用来传递参数的数组 
		//0 最大的数字在数组arr中的位置 1 最大的数字 
		//2最小的数字在数组arr中的位置 3最小的数字
		int[]  mm = new int[4];
		
		findMax(arr, mm);//传数组进去
		findMix(arr, mm);
/*		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + "  ");
		}*/
		//System.out.println( b.toString());
		System.out.println("最大的数字在数组arr中的位置是："+mm[0] +"最大的数字是："+mm[1]);//打印不正常
		System.out.println("最小的数字在数组arr中的位置是："+mm[2] +"最小的数字是："+mm[3]);//打印不正常
		exchangMaxMix(arr, mm);
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}
	public static void reverse(int[] a ,int[] b){//反转数组
		for (int i = 0; i < a.length; i++) {
			b[a.length - i-1] = a[i];
		}
	}
	public static void findMax(int[] a ,int[] mm){
		
		for (int j = 0; j < a.length; j++) {
			if (a[j] > mm[1]) {//找到最大值
				mm[0] = j;//最大值的位置
			//	System.out.println(mm[0] );//输出
				mm[1] = a[j];//最大值的值
				//System.out.println(mm[1] );//输出
			}
		}
		
	}
	/**
	 * 找到最小值
	 * @param a
	 * @param mm
	 */
	public static void findMix(int[] a ,int[] mm){
		mm[3] = a[0];//预先给初值
		for (int j = 0; j < a.length; j++) {
			if (a[j] < mm[3]) {//找到最小值
				mm[2] = j;//小大值的位置
				//System.out.println(mm[0] );//输出
				mm[3] = a[j];//最小值的值
				//System.out.println(mm[1] );//输出
			}
		}
	}
	public static void exchangMaxMix(int[] arr , int[] mm){
		arr[mm[0]] = mm[3];//将最小值赋予最大值的位置
		arr[mm[2]] = mm[1];
		
	}

}
