package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.IOException;

public class Work01 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				String pathname = "..\\..\\a";
				File file = new File(pathname);
				System.out.println();
				//System.out.println(file.exists());
				//System.out.println(file.isFile());//ֻ�����ļ�����ʱ������ж��Ƿ�Ϊ�ļ�
				//System.out.println(file.isAbsolute());
				//System.out.println(file.isDirectory());//ֻ�����ļ��д���ʱ������ж��Ƿ�Ϊ�ļ�
				//creatNewFile(file);
				//file.mkdir();
				System.out.println(file.getAbsolutePath());
				

	}


	private static void creatNewFile(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();	
			System.out.println("�����ɹ�");
		}
	}

}
