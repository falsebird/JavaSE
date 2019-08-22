package cn.luoziyuan.homework.day06;

public class Work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));

		
	}
	/**
	 * @param a
	 * @return
	 * ÇóaµÄ½×³Ë
	 */
	public static int  factorial(int a ){
		if (a>=0) {
			if (a==1||a==0) {
				return 1;
			}else {
				return a*factorial(a-1);
			}
			
		}
		return -1;
	}

}
