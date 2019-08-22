package cn.luoziyuan.homework.day07;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mr.j
 *4.�ݹ��ҳ��ļ��������е�.java�ļ�;
 */
public class Work04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src");
		List<File> files = new ArrayList<File>();
		getAllJavaFile(files ,file);//��ȡ���е�.java�ļ�
		for (Iterator<File> iterator = files.iterator(); iterator.hasNext();) {
			File file1 = (File) iterator.next();
			System.out.println(file1.getAbsolutePath());
		}
	}
	/**
	 * @param files
	 * @param file
	 * �ݹ�Ĳ���һ���ļ��������е�.java�ļ�
	 */
	private static void getAllJavaFile(List<File> files ,File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {//���ļ������ڲŽ�������Ĳ���
			if (file.isDirectory()) {//��һfile��һ���ļ���ʱ���ֱ����ļ����µ�����
				File[] filess = file.listFiles();
				for (int i = 0; i < filess.length; i++) {
					if (filess[i].isDirectory()) {//��filess[i]���ļ����ǵݹ鴦��
						getAllJavaFile(files, filess[i]);
					}else if (isJavaFile(filess[i])) {//������ļ����ļ��ҷ�������ʱ����
						files.add(filess[i]);	
					}
				}
			}else  {
				if (isJavaFile(file)) {//������ļ����ļ��ҷ�������ʱ����
					files.add(file);
				}
			}	
		}
	}
	/**
	 * @param file
	 * @return
	 * �ж�һ���ļ��Ƿ���
	 */
	public static boolean isJavaFile(File file){
		String pathname = file.getName();
		return pathname.endsWith(".java");
	}
	
}
