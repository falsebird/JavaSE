package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @a uthor mr.j 5.ͨ���ַ�������һ���ı��ļ�
 * ͨ�������������Եķ���һ�θ���һ���ַ������һ�θ���һ���ַ�ʡ���ʱ��
 * ����ʹ���ַ��������ļ���������������
 */
public class Work05 {
	public static void main(String[] args) throws IOException {
		File src = new File("aaa.txt");
		File dest1 = new File("bbb.txt");
		File dest2 = new File("ccc.txt");
		Long current1 = System.currentTimeMillis();
		copyFileOnChar(src, dest1);
		Long current2 = System.currentTimeMillis();
		copyFileOnChars(src, dest2);
		Long current3 = System.currentTimeMillis();
		System.out.println("ͨ�������ַ������ļ���ʱ�䣺"+(current2-current1));//61
		System.out.println("ͨ�������ַ����鸴���ļ���ʱ�䣺"+(current3-current2));//3
	}

	/**
	 * һ�ζ�дһ���ַ����ļ�
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileOnChar(File src, File dest) throws IOException {
		FileReader reader = new FileReader(src);
		FileWriter writer = new FileWriter(dest);
	
		// һ�ζ�дһ���ַ�
		int ch;
		while ((ch = reader.read()) != -1) {
			writer.write(ch);
			writer.flush();
		}
		reader.close();
		writer.close();
	}

	/**
	 * һ�ζ�дһ���ַ����鸴�ļ�
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileOnChars(File src, File dest) throws IOException {
		FileReader reader = new FileReader(src);
		FileWriter writer = new FileWriter(dest);
		
		
		// һ�ζ�дһ���ַ�����
		int len;// ��¼��ȡ�����ļ�����
		char[] chars = new char[1024];
		while ((len = reader.read(chars)) != -1) {
			writer.write(chars, 0, len);

		}
		
		reader.close();
		writer.close();
	}
}
