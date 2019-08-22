package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @a uthor mr.j 5.通过字符流复制一个文本文件
 * 通过测是我们明显的发现一次复制一个字符数组比一次复制一个字符省许多时间
 * 另外使用字符流复制文件会出现乱码的想象
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
		System.out.println("通过复制字符复制文件的时间："+(current2-current1));//61
		System.out.println("通过复制字符数组复制文件的时间："+(current3-current2));//3
	}

	/**
	 * 一次读写一个字符复文件
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileOnChar(File src, File dest) throws IOException {
		FileReader reader = new FileReader(src);
		FileWriter writer = new FileWriter(dest);
	
		// 一次读写一个字符
		int ch;
		while ((ch = reader.read()) != -1) {
			writer.write(ch);
			writer.flush();
		}
		reader.close();
		writer.close();
	}

	/**
	 * 一次读写一个字符数组复文件
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileOnChars(File src, File dest) throws IOException {
		FileReader reader = new FileReader(src);
		FileWriter writer = new FileWriter(dest);
		
		
		// 一次读写一个字符数组
		int len;// 记录读取到的文件长度
		char[] chars = new char[1024];
		while ((len = reader.read(chars)) != -1) {
			writer.write(chars, 0, len);

		}
		
		reader.close();
		writer.close();
	}
}
