package cn.luoziyuan.homework.day01;

/**
 * @author mr.j
 *
 *�����д�����
 */
public class Work04 {

	public static void main(String[] args) {
		int[] arr = {12,34,465,3,45};//���������
		int[] b = new int[arr.length];
		reverse(arr, b);
		//�´���һ���������ݲ��������� 
		//0 ��������������arr�е�λ�� 1 �������� 
		//2��С������������arr�е�λ�� 3��С������
		int[]  mm = new int[4];
		
		findMax(arr, mm);//�������ȥ
		findMix(arr, mm);
/*		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + "  ");
		}*/
		//System.out.println( b.toString());
		System.out.println("��������������arr�е�λ���ǣ�"+mm[0] +"���������ǣ�"+mm[1]);//��ӡ������
		System.out.println("��С������������arr�е�λ���ǣ�"+mm[2] +"��С�������ǣ�"+mm[3]);//��ӡ������
		exchangMaxMix(arr, mm);
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}
	public static void reverse(int[] a ,int[] b){//��ת����
		for (int i = 0; i < a.length; i++) {
			b[a.length - i-1] = a[i];
		}
	}
	public static void findMax(int[] a ,int[] mm){
		
		for (int j = 0; j < a.length; j++) {
			if (a[j] > mm[1]) {//�ҵ����ֵ
				mm[0] = j;//���ֵ��λ��
			//	System.out.println(mm[0] );//���
				mm[1] = a[j];//���ֵ��ֵ
				//System.out.println(mm[1] );//���
			}
		}
		
	}
	/**
	 * �ҵ���Сֵ
	 * @param a
	 * @param mm
	 */
	public static void findMix(int[] a ,int[] mm){
		mm[3] = a[0];//Ԥ�ȸ���ֵ
		for (int j = 0; j < a.length; j++) {
			if (a[j] < mm[3]) {//�ҵ���Сֵ
				mm[2] = j;//С��ֵ��λ��
				//System.out.println(mm[0] );//���
				mm[3] = a[j];//��Сֵ��ֵ
				//System.out.println(mm[1] );//���
			}
		}
	}
	public static void exchangMaxMix(int[] arr , int[] mm){
		arr[mm[0]] = mm[3];//����Сֵ�������ֵ��λ��
		arr[mm[2]] = mm[1];
		
	}

}
